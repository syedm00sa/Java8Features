package com.learnJava.streams;

import static java.util.stream.Collectors.toList;

import java.util.List;

import sid.java8.data.Student;
import sid.java8.data.StudentDataBase;

public class StreamsFilterExample {

    public static List<Student> filterStudents(){

        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .filter((student -> student.getGender().equals("female"))) //Stream<Student>
                //filters and sends only the students whose gender is female
                .filter(student -> student.getGpa()>=3.9)
                .collect(toList());

    }

    public static void main(String[] args) {

        //System.out.println("filterStudents : " + filterStudents());
        filterStudents().forEach(System.out::println);

    }
}
