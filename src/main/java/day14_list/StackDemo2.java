package day14_list;

import java.util.Stack;
import java.util.stream.IntStream;

public class StackDemo2 {
    public static void main(String[] args) {
        String Java = "Java";
        char[] a = Java.toCharArray();
        Stack<Character> Javas = new Stack<>();
        for(char as :a ){
            Javas.push(as);
            System.out.println(Javas);
        }
        while (!Javas.isEmpty()) {            
            System.out.println(Javas.pop());
            System.out.println(Javas);
        }
        
        String str = "Java";
        char[] chars =str.toCharArray();
        Stack<Character> names = new Stack<>();
        IntStream.range(0, chars.length).forEach(i -> names.push(chars[i]));
    }
}
