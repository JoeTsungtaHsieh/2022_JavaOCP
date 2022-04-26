package day12_equals;

public class BallStore {

    public static void main(String[] args) {
        Ball b1 = new Ball("Black", 100);
        Ball b2 = new Ball("Black", 100);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1==b2);
        System.out.println(b1.equals(b2));
        
    }
}
