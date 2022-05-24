package day20_thread;

interface Box {
    void putMoney(int money);
}

class Mother extends Thread{
    private Box box;
    public Mother(Box box){
        System.out.println("媽媽拿到box");
        this.box = box;
    }
    @Override
    public void run() {
        System.out.println("媽媽在box裡放入50元");
        box.putMoney(50);
    }
}

public class Ming extends Thread{
    private int money = 100;
    private Box box = (money) -> System.out.println("小明有 $" + (this.money + money));
    @Override
    public void run() {
        System.out.println("小明請媽媽給50元零用錢並將BOX給媽媽");
        Mother mother = new Mother(box);
        mother.start();
    }
    public static void main(String[] args) {
        System.out.println("小明要拿零用錢");
        Ming ming = new Ming();
        ming.start();
    }
}
