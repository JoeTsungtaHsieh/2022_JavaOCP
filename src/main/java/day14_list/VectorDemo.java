package day14_list;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(41, 5);
        System.out.println("capacity: " + v.capacity());
        System.out.println("size" + v.size());
        for(int i=1; i<=41;i++){
            v.add(i);
        }
        v.add(99);
        System.out.println(v);
        System.out.println("capacity: " + v.capacity());
        System.out.println("size" + v.size());
    }
}
