package day09_oo;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFlatDemo2 {
    public static void main(String[] args) {
        String[][] names = {
            {"John", "Mary"},{"Jo"},{"Vincent", "Anita", "Howard","Joanna"}  
        };
        // 利用 Java 8 求出名字頻均字母
        Arrays.stream(names).forEach(System.out::println);
        Arrays.stream(names).flatMap(Stream::of).forEach(System.out::println);
        
        double avg = Arrays.stream(names) // Stream<String[]>
                           .flatMap(Stream::of) // Stream<String>
                           .mapToInt(String::length) // IntStream
                           .average()
                           .getAsDouble();
        System.out.println(avg);
        
        
        
        double avg2 = Stream.of(names)
                .flatMap(Stream::of)
                .mapToInt(String -> String.length())
                .average()
                .getAsDouble();
        
        System.out.println(avg2);
    }
}
