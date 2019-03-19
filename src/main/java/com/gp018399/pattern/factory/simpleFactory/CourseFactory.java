package com.gp018399.pattern.factory.simpleFactory;

public class CourseFactory {
    public ICourse create(String name){
        if("Java".equals(name)){
            return new JavaCourse();
        }else if ("Python".equals(name)){
            return new PythonCourse();
        }else{
            return null;
        }
    }
}
