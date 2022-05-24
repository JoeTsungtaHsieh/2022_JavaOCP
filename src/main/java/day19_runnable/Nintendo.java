package day19_runnable;

import day19_thread.SuperMario;

public class Nintendo {
    public static void main(String[] args) {
        // 準備卡帶
        Mario mario = new Mario();
        Bubble bubble = new Bubble();
        KingKong kingKong = new KingKong();
        SuperMario superMario = new SuperMario();
        Runnable pal = () -> System.out.println("仙劍奇俠傳");
        // 主機
        Thread thread1 = new Thread(kingKong);
        Thread thread2 = new Thread(pal);
        thread1.start();
        thread2.start();
    }
}
