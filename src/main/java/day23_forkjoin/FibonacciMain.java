package day23_forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class Fibonacci {
    public long fib(int n){
        if(n <= 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
        
}

class FibonacciTask extends RecursiveTask<Long> {
    private final int THRESHOLD = 20;
    private int n; // 第 n 項

    FibonacciTask(int n) {
        this.n = n;
    }

    @Override
    protected Long compute() {
        if(n < THRESHOLD){
            Fibonacci fibonacci = new Fibonacci();
            return  fibonacci.fib(n);
        }
        // 拆分 Fork
        FibonacciTask subTask1 = new FibonacciTask(n-1);
        FibonacciTask subTask2 = new FibonacciTask(n-2);
        // 執行 Fork
        invokeAll(subTask1,subTask2);
        // Join
        long subTask1Result = subTask1.join();
        long subTask2Result = subTask2.join();
        long result = subTask1Result + subTask2Result;
        return result;
    }
    
}

public class FibonacciMain {
    public static void main(String[] args) {
        int n = 45;
        // 傳統遞迴求解
        Fibonacci fibonacci = new Fibonacci();
        long startTime = System.currentTimeMillis();
        long result = fibonacci.fib(n);
        long endTime = System.currentTimeMillis();
        System.out.printf("傳統遞迴求解 %d 項 = %,d"
                          + "花費時間: %d ms\n", n, result, (endTime - startTime));
        
        // ForkJion 遞迴求解
        FibonacciTask task = new FibonacciTask(n);
        ForkJoinPool pool = ForkJoinPool.commonPool();
        startTime = System.currentTimeMillis();
        result = pool.invoke(task);
        endTime = System.currentTimeMillis();
        
        System.out.printf("ForkJoin遞迴求解 %d 項 = %,d"
                          + "花費時間: %d ms\n", n, result, (endTime - startTime));
    }
}
