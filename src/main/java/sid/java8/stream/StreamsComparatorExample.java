package sid.java8.stream;

import static java.util.stream.Collectors.toList;

import java.util.Comparator;
import java.util.List;

import sid.java8.data.Student;
import sid.java8.data.StudentDataBase;

public class StreamsComparatorExample {

    public static List<Student> sortStudentsByName(){

        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))//SORTED which accept the input
                .collect(toList());
    }																										

    public static List<Student> sortStudentsByGpa(){

        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(toList());
    }

    public static List<Student> sortStudentsByGpaDesc(){

        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())//it print the value by decending order
                .collect(toList());
    }

    public static void main(String[] args) {

        System.out.println("Students sorted by Name : ");
        sortStudentsByName().forEach(System.out::println);
        System.out.println("Students sorted by GPA : ");
        sortStudentsByGpa().forEach(System.out::println);
        System.out.println("Students sorted by GPA DESC: ");
        sortStudentsByGpaDesc().forEach(System.out::println);

    }
}
