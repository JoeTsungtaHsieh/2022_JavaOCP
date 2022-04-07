package day06_oo;
// 建構子操作
public class Pen {
    public Pen() {
        this("88");
        System.out.println("A");
    }
    public Pen(Integer price) {
        System.out.println("B, price:" + price);
    }
    public Pen(String color) {
        this(88);
        System.out.println("C, color:" + color);
    }
    
    // 主程式
    public static void main(String[] args) {
        Pen p1 = new Pen();
    }
    
}