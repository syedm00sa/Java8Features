package sid.java8.optional;

import java.util.Optional;

import sid.java8.data.Bike;
import sid.java8.data.Student;
import sid.java8.data.StudentDataBase;

public class OptionalMapFlatMapExample {

    public static void optionalFlatMap(){
      Optional<Student> studentOptional =  StudentDataBase.getOptionalStudent();
      if(studentOptional.isPresent()){
          Optional<Bike> bikeOptional= studentOptional.
                  flatMap(Student::getBike); //
          System.out.println("bikeOptional : " + bikeOptional);
      }
    }

    public static void optionalMap(){
        Optional<Student> studentOptional =  StudentDataBase.getOptionalStudent();

        if(studentOptional.isPresent()){
            Optional<String> nameOptional= studentOptional.
                    map(Student::getName); //
            System.out.println("nameOptional : " + nameOptional);
        }
    }

    public static void optionalFilter(){

        Optional<Student> studentOptional = StudentDataBase.getOptionalStudent()
                .filter(student -> student.getGpa()>=4.0);

        studentOptional.ifPresent(student -> System.out.println(student));

    }

    public static void main(String[] args) {
        optionalFlatMap();
        optionalMap();
        optionalFilter();
    }
}
