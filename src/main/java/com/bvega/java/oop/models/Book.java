package com.bvega.java.oop.models;

import java.util.Date;
import java.util.List;

public class Book {

    private String name;
    private Integer numberPage;
    private Date publishedDate;
    private List<Author> authors;

    public Book(String name, Integer numberPage, Date publishedDate, List<Author> authors) {
        this.name = name;
        this.numberPage = numberPage;
        this.publishedDate = publishedDate;
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", numberPage=" + numberPage +
                ", publishedDate=" + publishedDate +
                ", authors=" + authors +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(Integer numberPage) {
        this.numberPage = numberPage;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
