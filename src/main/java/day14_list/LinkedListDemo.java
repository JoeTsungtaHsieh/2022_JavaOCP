package day14_list;

// LinkedList 有較快的新增(插入)/修改/刪除的效能

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

// LinkedList 查詢速度慢於 ArrayList
public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> scores = new LinkedList<>();
        scores.add(100);
        scores.add(90);
        scores.add(90);
        scores.add(0, 80); // 將80 放入第一個位置(第一個位置 index 0)
        scores.add(60);
        System.out.println(scores);
        
        // 透過 ListIterator 來輪詢 scores
        ListIterator<Integer> iter = scores.listIterator();
        while (iter.hasNext()) {
            int index = iter.nextIndex();
            Integer next = iter.next();
            System.out.printf("%d : %d\n", index, next);
        }
        System.out.println("------------------------------");
        while (iter.hasPrevious()) {
                      
            int index = iter.nextIndex();
            Integer previous = iter.previous();  
            System.out.printf("%d : %d\n", index, previous);
        }
        
        // JAVA 8 輪詢資料
        scores.forEach(score -> System.out.println(score));
        scores.forEach(System.out::println);
    }
}
