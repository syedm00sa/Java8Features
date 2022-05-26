package sid.java8.stream;

import static java.util.stream.Collectors.toList;

import java.util.List;

import sid.java8.data.Student;
import sid.java8.data.StudentDataBase;

public class StreamsFlatMapExample {
	
	public static List<String> printStudentActivitiesUsingFlatMap(){

        List<String> studentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>
                .flatMap(List::stream) //Flat map convert the List into Stream = Stream<String>
                .collect(toList());

        return studentActivities;
    }
	
	public static List<String> printStudentActivitiesUdingdistinct(){

        List<String> studentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>
                .flatMap(List::stream) // Stream<String>
                .distinct()
                .collect(toList());

        return studentActivities;
    }

    public static List<String> printStudentActivitiesUdingsorted(){

        List<String> studentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>
                .flatMap(List::stream) // Stream<String>
                .distinct()
                .sorted()
                .collect(toList());

        return studentActivities;
    }
    
    public static long getStudentActivitiesUsingCount(){

        long noOfStudentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>
                .flatMap(List::stream) //Stream<String>
                .distinct() //Stream<String> -> with distinct function performed
                .count();

        return noOfStudentActivities;
    }

    public static void main(String[] args) {

        System.out.println("printStudentActivitiesUsingFlatMap : " + printStudentActivitiesUsingFlatMap());
        System.out.println("*****************************************************************************************************");
        System.out.println("printStudentActivitiesUdingdistinct : " + printStudentActivitiesUdingdistinct());
        System.out.println("*****************************************************************************************************");
        System.out.println("printStudentActivitiesUdingsorted : " + printStudentActivitiesUdingsorted());
        System.out.println("*****************************************************************************************************");
        System.out.println("getStudentActivitiesUsingCount : " + getStudentActivitiesUsingCount());

    }
}
