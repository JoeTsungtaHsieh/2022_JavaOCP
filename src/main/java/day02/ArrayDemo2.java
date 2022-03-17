package day02;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] scores = {100,90,80};
        // 相當於 int[] scores = new int[] {100,90,80};
        
        //計算總分與平均
        // 利用 for-loop 或 for-each 輪詢每一個元素並加總
        int sum = 0;
        for(int i=0; i<scores.length;i++){
            sum += scores[i];
            System.out.println("sum = " + sum);
        }
        double avg = sum / (double)scores.length;
        System.out.printf("平均: %.1f\n",avg);
        
        int sum2 = 0;
        for(int score:scores){
            sum2 += score;
            System.out.println("sum2 = " + sum2);
        }
        double avg2 = sum2 / (double)scores.length;
        System.out.printf("平均2: %.1f\n",avg2);
    }
}
