package sid.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static Optional<Integer> findMinvalue(List<Integer> integerList){
        return integerList.stream()
                //x variable holds the min value for each element in the iteration
                .reduce((x,y)-> x<y ? x : y);
    }

    public static int findMaxvalue(List<Integer> integerList){
        return integerList.stream()
                //x variable holds the max value for each element in the iteration
                .reduce(0,(x,y)-> x>y ? x : y);
    }
    
    public static Optional<Integer> findMaxvalueOptional(List<Integer> integerList){
        return integerList.stream()
                //x variable holds the max value for each element in the iteration
                .reduce((x,y)-> x>y ? x : y);
    }

    public static void main(String[] args) {

        String newline = System.lineSeparator();
        
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        
        int maxValue = findMaxvalue(integerList);
        System.out.println("Max value is :" + maxValue+ newline);

        Optional<Integer> minValueOptional = findMinvalue(integerList);
        System.out.println("minValueOptional : " + minValueOptional + newline );

        if(minValueOptional.isPresent()){
            System.out.println("MinValue is : " + minValueOptional.get()+ newline);
        }else{
            System.out.println("No Input is passed"+ newline);
        }
        System.out.println("**************************************************************************");
        
        Optional<Integer> maxValueOptional = findMaxvalueOptional(integerList);
        System.out.println(newline + "Optional Max is : " + maxValueOptional+ newline);
        
        if(maxValueOptional.isPresent()){
            System.out.println("MaxValue using optional :" + maxValueOptional.get()+ newline);
        }else{
            System.out.println("Input list is empty"+ newline);
        }


    }
}
