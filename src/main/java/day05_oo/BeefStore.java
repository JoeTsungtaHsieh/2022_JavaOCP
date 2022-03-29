package day05_oo;

import java.util.Arrays;
import java.util.OptionalDouble;

public class BeefStore {
    public static void main(String[] args) {
        Beef beef1 = new Beef("碎牛肉", 15);
        Beef beef2 = new Beef("菲力牛排", 45);
        Beef beef3 = new Beef("沙朗牛排", 30);
        Beef beef4 = new Beef("組合牛", 10);
        Beef beef5 = new Beef("牛小排", 35);
        
        Beef[] beefs = {beef1, beef2, beef3, beef4, beef5};
        
        // 請求出是"牛排"的平均價格 = ?
        // Java 7
        int sum = 0;
        int count = 0;
        for(Beef beef : beefs) {
            if(beef.getName().contains("排")) {
                count++;
                sum += beef.getPrice();
            }
        }
        double avg = sum / (double)count;
        System.out.printf("牛排的平均價格 = %.2f\n", avg);
        
        // 請求出是"牛排"的平均價格 = ?
        // Java 8
        double avg2 = Arrays.stream(beefs)
                            .filter(beef -> beef.getName().contains("排"))
                            .mapToInt(beef -> beef.getPrice())
                            .average()
                            .getAsDouble();
        System.out.printf("牛排的平均價格(1) = %.2f\n", avg2);
        
        // 改良上述寫法
        OptionalDouble optBeefAvg = Arrays.stream(beefs)
                            .filter(beef -> beef.getName().contains("排"))
                            .mapToInt(beef -> beef.getPrice())
                            .average();
        if(optBeefAvg.isPresent()) {
            System.out.printf("牛排的平均價格(2) = %.2f\n", optBeefAvg.getAsDouble());
        } else {
            System.out.println("本店不提供牛排");
        }
        
        
        // 請求出是"豬"排的平均價格 = ?
        OptionalDouble optAvg = Arrays.stream(beefs)
                            .filter(beef -> beef.getName().contains("豬"))
                            .mapToInt(beef -> beef.getPrice())
                            .average();
        if(optAvg.isPresent()) {
            System.out.printf("豬排的平均價格 = %.2f\n", optAvg.getAsDouble());
        } else {
            System.out.println("本店不提供豬排");
        }
    }
}
