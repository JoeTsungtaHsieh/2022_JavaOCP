package day19_runnable;
import java.util.Random;
public class FamilyMark {
    public static void main(String[] args) {
        Runnable buyCoffee = () -> {
            try {
                Thread.sleep(new Random().nextInt(5000));
                System.out.printf("%s 買咖啡\n", Thread.currentThread().getName());
            } catch (Exception e) {
            }
        };
        
        Runnable buyCookie = () -> {
            try {
                Thread.sleep(new Random().nextInt(5000));
                System.out.printf("%s 買餅乾\n", Thread.currentThread().getName());
            } catch (Exception e) {
            }
        };
        
        Thread thread1 = new Thread(buyCoffee, "小明");
        Thread thread2 = new Thread(buyCookie, "小英");
        thread1.start();
        thread2.start();
    }
}