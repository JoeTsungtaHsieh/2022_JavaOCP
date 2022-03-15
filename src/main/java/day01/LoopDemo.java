package day01;
// https://github.com/JoeTsungtaHsieh/2022_JavaOCP.git
// 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
public class LoopDemo {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1;i<=10;i++){
            System.out.printf("i = %d\n",i);
            sum+= i;
            System.out.printf("sum = %d\n", sum);
        }
        System.out.printf("total sum = %d\n", sum);
    }
}
