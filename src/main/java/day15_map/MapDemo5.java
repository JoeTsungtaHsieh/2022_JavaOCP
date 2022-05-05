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
        Fruit.order = Order.PRICE;
        // 注意: 若有相同價格,只會出現一個水果元素
        // 例如 apple 與 papaya都是 1.99 ,則 fruits 集合中只會出現 apple
        TreeMap<Fruit, String> fruits = new TreeMap<>();
        fruits.put(new Fruit("apple", 100, 1.99),"梨山");
        fruits.put(new Fruit("watermelon", 200, 3.99),"花蓮");
        fruits.put(new Fruit("banana", 300, 2.99),"屏東");
        fruits.put(new Fruit("papaya", 400, 1.99),"南投");
        System.out.println(fruits);
    }

}
