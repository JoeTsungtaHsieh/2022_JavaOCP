package day07_oo;

import java.util.stream.Stream;

public class AutoBoxingUnBoxing2 {

    public static void main(String[] args) {
        Integer[] scores = {100, 93, 81}; // Auto-Boxing
        int sum1 = Stream.of(scores).mapToInt(s -> s.intValue()).sum();
        int sum2 = Stream.of(scores).mapToInt(s -> s).sum(); // Auto-UnBoxing
        int sum3 = Stream.of(scores).mapToInt(Integer::intValue).sum();
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        
        Object[] nums = {"100", 93, "81"};
        // 球平均
        double avg = Stream.of(nums) // Stream<Object>
                            .map(n -> n.toString()) // Stream<String>
                            .mapToInt(n -> Integer.parseInt(n))  //IntStream
                            .average()
                            .getAsDouble();
        System.out.println(avg);
        double avg2 = Stream.of(nums) // Stream<Object>
                            .map(Object::toString) // Stream<String>
                            .mapToInt(Integer::parseInt)  //IntStream
                            .average()
                            .getAsDouble();
        System.out.println(avg2);
        
        Object[] values = {"100", 93, 81.5, new Integer(75)};
        // 求平均
        double avg3 = Stream.of(values)
                        .map(Object::toString)
                        .mapToDouble(Double::parseDouble)
                        .average()
                        .getAsDouble();
        System.out.println(avg3);
    }
}
