package de.workshop.spring.chapter2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans-Chapter2.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
        objA.getMessage();
        ((ClassPathXmlApplicationContext) context).close();
    }
}