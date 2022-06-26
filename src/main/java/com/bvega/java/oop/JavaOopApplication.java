package com.bvega.java.oop;

import com.bvega.java.oop.models.Author;
import com.bvega.java.oop.models.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@SpringBootApplication
public class JavaOopApplication implements ApplicationRunner {
    
    private static final Logger log = LoggerFactory.getLogger(JavaOopApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(JavaOopApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) {

        //create authors
        Author authorOne = new Author("Pablo","Neruda","Ecuador",54);
        Author authorTwo = new Author("Luis","Fernandez","España",60);
        Author authorThree = new Author("Gabriel","Reinoso","Ecuador",21);

        //create book one
        List<Author> authorsBookOne = new LinkedList<>();
        authorsBookOne.add(authorOne);
        authorsBookOne.add(authorTwo);

        Book bookOne = new Book("Ciencias de la computacion",450,new Date(),authorsBookOne);

        //create book two
        List<Author> authorsBookTwo = new LinkedList<>();
        authorsBookTwo.add(authorTwo);
        authorsBookTwo.add(authorThree);

        Book bookTwo = new Book("Fundamentos de programación",250,new Date(),authorsBookTwo);

        //print books
        log.info("==================================================");
        log.info("Books info");
        log.info("==================================================");
        log.info(bookOne.toString());
        log.info(bookTwo.toString());

        //create list of books
        List<Book> books = new LinkedList<>();
        books.add(bookOne);
        books.add(bookTwo);

        //filter by min number of page
        List<Book> booksFilter = books.stream().filter(book -> book.getNumberPage() > 300).collect(Collectors.toList());

        log.info("==================================================");
        log.info("Filter books by min number of page: 300 pag");
        log.info("==================================================");

        log.info(String.valueOf(booksFilter));

        //get unique authors of list books
        Set<Author> authorsUnique = books.stream().flatMap(book -> book.getAuthors().stream()).collect(Collectors.toSet());

        log.info("==================================================");
        log.info("Get unique authors of list books");
        log.info("==================================================");

        log.info(String.valueOf(authorsUnique));

        //filter unique authors list by age
        Set<Author> authorsFilter = books.stream().flatMap(book -> book.getAuthors().stream().filter(author -> author.getAge()>50)).collect(Collectors.toSet());

        log.info("==================================================");
        log.info("Filter unique authors list by age: >50");
        log.info("==================================================");

        log.info(String.valueOf(authorsFilter));

    }
}
