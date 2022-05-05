package day15_map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class MapDemo4 {
    public static void main(String[] args) {
        // Hashtable 是一總執行續安全的集合
        // 並有一個走訪器名叫 eunmeration
        Hashtable<String, Integer> people = new Hashtable<>();
        people.put("John", 18); // key(String)/value(Integer) 姓名/年齡 
        people.put("Mary", 17);
        people.put("Bob", 16);
        people.put("Helen", 18);
        people.put("Jo", 17);
        people.putIfAbsent("Jo", 27); // 若'Jo'已存在, 資料就不覆寫
        Enumeration<Integer> enumeration = people.elements();
        while (enumeration.hasMoreElements()) {
            Integer nextElement = enumeration.nextElement();
            System.out.println(nextElement);
        }
    }
}
