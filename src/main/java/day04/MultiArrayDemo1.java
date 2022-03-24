package day04;

import java.util.Arrays;

public class MultiArrayDemo1 {
    public static void main(String[] args) {
        // 二維陣列
        int[][] scores = new int[3][2]; // 3x2 二維對稱型陣列
        System.out.println(scores);
        System.out.println("scores 二維陣列長度:" + scores.length);
        System.out.println(scores[0]);
        System.out.println("scores[0] 一維陣列長度:" + scores[0].length);
        System.out.println(scores[0][0]);
        scores[0][0] = 100;
        System.out.println(scores[0][0]);
        // 利用 Arrays.toString() 印出一維陣列內容
        // scores 是二維陣列, 因此 score 就是一維陣列
        for(int [] score : scores) {
            System.out.println(Arrays.toString(score));
        }
    }
}