package day20_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class Father implements Callable<Integer>{
    
    @Override
    public Integer call() {
        return  50;
    }
}

public class Eng {
    public static void main(String[] args) {
        FutureTask<Integer> task = new FutureTask<>(new Father());
        new Thread(task).start();
        try {
            int money = task.get();  
            System.out.println(money);
        } catch (Exception e) {
        }

    }
}
