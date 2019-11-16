package com.example.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStart {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");

        Point p = (Point) applicationContext.getBean("tenPoint");
        System.out.println(p.toString());

        System.out.println("============Starting Calculator==============");
        Calculator calculator = (Calculator) applicationContext.getBean("calc");

        System.out.println(calculator.add());
        System.out.println(calculator.subtract());
        System.out.println(calculator.multiply());
        System.out.println(calculator.divide());

        System.out.println("============Starting Animal ==============");
        Animal dog = (Animal) applicationContext.getBean("dog");
        System.out.println(dog.getSpeciesName());
        System.out.println(dog.getHeight());
        System.out.println(dog.getWeight());


    }
}
