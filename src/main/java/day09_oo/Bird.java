package day09_oo;

public class Bird extends Animal {
    int legs = 2;
    void move() {
        System.out.println("我會飛");
    }
    int getLegs() {
        return legs;
    }
}