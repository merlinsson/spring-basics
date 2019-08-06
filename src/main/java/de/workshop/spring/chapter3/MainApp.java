package de.workshop.spring.chapter3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans-Chapter3.xml");
        HelloWorldInterface objA = (HelloWorldInterface) context.getBean("helloWorld");
        objA.getMessage();
        ((ClassPathXmlApplicationContext) context).close();
    }
}