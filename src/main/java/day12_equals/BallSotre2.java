package day12_equals;

public class BallSotre2 {
    public static void main(String[] args) {
        // 兩物件相等 equals 要等於 true
        // 兩物件相等 hashcode 值也要相等
        
        String s1 = new String("Java");
        String s2 = new String("Java");
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() + " 相等 " + s2.hashCode());
        System.out.println("---------------------------");
        Ball b1 = new Ball("Red", 100);
        Ball b2 = new Ball("Red", 100);
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode() + " 相等 " + b2.hashCode());
    }
    
}
