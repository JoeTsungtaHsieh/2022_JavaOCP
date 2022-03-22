package day03;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = new String("java");
        System.out.println(s1.equals(s2)); // 有區分大小寫
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3)); // 不區分大小寫
        String s4 = "Java";
        String s5 = "Java";
        System.out.println(s4 == s5);
        System.out.println(s4.equals(s5));
    }
}
