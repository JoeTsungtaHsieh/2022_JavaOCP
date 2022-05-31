package day22_cocurrent;

import java.util.concurrent.Executor;

public class MyExecutor implements Executor{

    @Override
    public void execute(Runnable command) {
        System.out.println("Runnable class: " + command.getClass().getSimpleName());
        Thread t = new Thread(command);
        t.start();
    }
    
}
