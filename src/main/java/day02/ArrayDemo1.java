package day02;

import java.util.Arrays;

public class ArrayDemo1 {

    public static void main(String[] args) {
        int[] scores = new int[3];
        scores[0] = 100;
        scores[1] = 90;
        scores[2] = 80;
        System.out.println("陣列長度" + scores.length);
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        
        for(int i=0;i<scores.length;i++){
            System.out.println(scores[1]);
        }
        // for-each (for-in) JAVA 5.0
        for(int score:scores){
            System.out.println(score);
        }
        // Arrrays.toString() 將陣列轉換成字串印出
        System.out.println(Arrays.toString(scores));
        
        // 直接印出 scores
        System.out.println(scores);
    }
}
