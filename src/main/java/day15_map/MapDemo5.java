package day15_map;

import java.util.TreeMap;

public class MapDemo5 {

    public static void main(String[] args) {
        TreeMap<String, Integer> people = new TreeMap<>();
        // 會根據 key 值 由小 -> 大排序
        people.put("John", 18); // key(String)/value(Integer) 姓名/年齡 
        people.put("Mary", 17);
        people.put("Bob", 16);
        people.put("Helen", 18);
        people.put("Jo", 17);
        System.out.println(people);
        //----------------------------------------------
        TreeMap<Fruit, String> fruits = new TreeMap<>();
        fruits.put(new Fruit("apple", 100, 1.99),"梨山");
        fruits.put(new Fruit("watermelon", 100, 1.99),"花蓮");
        fruits.put(new Fruit("banana", 100, 1.99),"屏東");
        fruits.put(new Fruit("papaya", 100, 1.99),"南投");
        
    }

}
