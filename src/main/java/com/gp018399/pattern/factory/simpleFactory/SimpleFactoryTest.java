package com.gp018399.pattern.factory.simpleFactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        ICourse course =  factory.create("Java");
        course.record();
    }
}
