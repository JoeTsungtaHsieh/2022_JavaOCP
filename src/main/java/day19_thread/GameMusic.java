package day19_thread;

// 遊戲配樂
public class GameMusic extends Thread{
    public void run(){
        while(true){
            System.out.println("music...");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                
            }
        }
    }
}
