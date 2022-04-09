package sid.java8.stream;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsFilterExample {

    public static List<Student> filterStudents(){
      System.out.println("filterStudentsList : ");

        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .filter((student -> student.getGender().equals("female"))) //Stream<Student>
                //filters and sends only the students whose gender is female
                .collect(toList());
    }
    
    public static List<Student> filterStudentsWithGpa(){

        return StudentDataBase.getAllStudents().stream()
                .filter((student -> student.getGender().equals("female")))
                .filter(student -> student.getGpa()>=3.9)
                //filters and sends only the students whose Gpa is grater than 3.9
                .collect(toList());
    }	

    public static void main(String[] args) {
    	
        String newline = System.lineSeparator();//this method use to Separator the line
        
        filterStudents().forEach(System.out::println);
        System.out.println("***********************************************"+ newline +"filterStudentsWithGpa:");
        filterStudentsWithGpa().forEach(System.out::println);

    }
}
