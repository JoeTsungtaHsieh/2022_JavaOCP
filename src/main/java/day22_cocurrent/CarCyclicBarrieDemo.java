package day22_cocurrent;

import java.util.concurrent.CyclicBarrier;

public class CarCyclicBarrieDemo {
    public static void main(String[] args) {
        int parties = 2;
        Runnable launch = () -> System.out.printf("%s 吃午飯\n",Thread.currentThread().getName());
        //CyclicBarrier cb = new CyclicBarrier(parties);
        CyclicBarrier cb = new CyclicBarrier(parties, launch);
        new Car(cb).start();
        new Car(cb).start();
        new Car(cb).start();
        new Car(cb).start();
    }
}
