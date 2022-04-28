package day13_set;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo3 {
    public static void main(String[] args) {
        Set dataSet = new HashSet();
        dataSet.add("國文"); // String
        dataSet.add(Integer.valueOf(100)); // Integer
        dataSet.add("英文"); // String
        dataSet.add(70); // Integer (auto-boxing) 
        dataSet.add("數學"); // String
        dataSet.add(90); // Integer (auto-boxing) 
        System.out.println(dataSet);
        // dataSet : [100, 國文, 英文, 70, 90, 數學] <- Object
        // 請計算總分 Java 8
        int sum = dataSet.stream()
                            .filter(data -> data instanceof Integer)
                            .mapToInt(data -> Integer.parseInt(data + " ")) // (data + " ") 將data物件變成字串
                            .sum();
        System.out.println(sum);
    }
}
