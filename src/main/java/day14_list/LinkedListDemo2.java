package day14_list;

import java.util.Arrays;
import java.util.List;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(100, 100, 90, 80); // 靜態集合
        System.out.println(scores);
        scores.add(90); // 不可加入新元素
        System.out.println(scores);
    }
}
