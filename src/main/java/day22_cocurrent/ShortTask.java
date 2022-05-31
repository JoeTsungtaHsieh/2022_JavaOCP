package day22_cocurrent;

// 短任務
public class ShortTask implements Runnable {

    @Override
    public void run() {
        System.out.println("短任務");
        DB.data += 1;
    }
    
}
