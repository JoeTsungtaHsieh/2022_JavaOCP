package day15_map;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class MapDemo2 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "watermelon","watermelon", "apple", "apple", "apple", "banana"};
        // 請問每一種水果有幾個
        // 結果範例: {apple=4, watermelon=2, orange=1, banana=1}
        
        Map<String, Long> resultMap = Arrays.stream(fruits)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        
        Map<String, Long> resultMap2 = Arrays.stream(fruits)
                .collect(groupingBy(identity(), counting()));
        System.out.println(resultMap);
        System.out.println(resultMap2);
    }
}
