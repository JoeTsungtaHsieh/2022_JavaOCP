package day13_set;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo2 {
    public static void main(String[] args) {
        Set dataSet = new HashSet();
        dataSet.add("國文"); // String
        dataSet.add(Integer.valueOf(100)); // Integer
        dataSet.add("英文"); // String
        dataSet.add(70); // Integer (auto-boxing) 
        dataSet.add("數學"); // String
        dataSet.add(90); // Integer (auto-boxing) 
        System.out.println(dataSet);
        
        Iterator iter = dataSet.iterator();
        int sum =0;
        while (iter.hasNext()) {
            Object next = iter.next();
            // 判斷是否是 Integer 資料類別
            if (next instanceof Integer){
                // 轉型成 Integer 並相加
                sum += (Integer)next;
            }
        }
        System.out.println(sum);
    }
}
