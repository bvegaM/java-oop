package com.bvega.java.oop;

import com.bvega.java.oop.models.Circle;
import com.bvega.java.oop.models.Figure;
import com.bvega.java.oop.models.Triangle;
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
        Figure circle = new Circle(20.0);
        Figure triangle = new Triangle(20.0,10.0);

        log.info("Perimeter circle: "+circle.calcPerimeter());
        log.info("Area triangle:" + triangle.calcArea());
    }
}
