package day19_thread;

public class Worker extends Thread{
    
    public Worker() {
        
    }
    
    public Worker(String tName, int priority) {
        // 改變執行去名稱
        setName(tName);
        // 改變權限
        setPriority(priority);
    }
    
    @Override
    public void run() {
        job();
    }
    
    
    
    public void job(){
        String tName = Thread.currentThread().getName();
        for(int i =1;i<=1000;i++){
            System.out.printf("%s 跑 %d 步\n",tName,i);
        }
    }
}
