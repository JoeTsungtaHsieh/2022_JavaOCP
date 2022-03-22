package day03;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        // Java Framework
        sb.append(" Framework");
        // Java Spring Framework
        sb.insert(5, "Spring ");
        System.out.println(sb);
    }
}
