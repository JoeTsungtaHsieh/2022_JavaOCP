package day19_thread;

public class WorkerTest {
    public static void main(String[] args) {
        String tName = Thread.currentThread().getName();
        System.out.printf("main() 開始: %s\n", tName);
        Worker worker1 = new Worker();
        
        Worker worker2 = new Worker("兔子",Thread.MIN_PRIORITY); // 1
        // 改執行緒名稱
        worker1.setName("烏龜");
        // 改變權限(1~100)之間
        worker1.setPriority(Thread.MAX_PRIORITY);// 10
        
        worker1.start();
        worker2.start();
        System.out.printf("main() 結束: %s\n", tName);
    }
}
