package day11_inner4;

import java.util.Random;

public class MyOuter {
    int instanceX = 10; // 物件變數
    static int staticX = 100; // 類別變數
    // 一般內部類別
    class MyInner {
        // 只能擁有物件成員(成員:屬性與方法)
        void foo() {
            System.out.println("MyInner foo()");
            System.out.println(MyOuter.this.instanceX); // 可直接取用 MyOuter 的物件變數
            System.out.println(MyOuter.staticX); // 可直接取用 MyOuter 的類別變數
            MyStaticInner.bar(); // 可直接調用靜態內部類別的類別方法
            //MyStaticInner.foo(); // 不可直接調用靜態內部類別的物件方法
        }
    }
    
    // static (靜態)內部類別
    static class MyStaticInner {
        int value = 0;

        public MyStaticInner() {
            value = new Random().nextInt(100);
        }
        
        // 可以同時擁有物件/類別成員(成員:屬性與方法)
        void foo() {
            System.out.println("MyStaticInner foo()");
            //System.out.println(MyOuter.this.instanceX); // 不可直接取用 MyOuter 的物件變數
            System.out.println(MyOuter.staticX); // 可直接取用 MyOuter 的類別變數
        }
        static void bar() {
            System.out.println("MyStaticInner static bar()");
            //System.out.println(MyOuter.this.instanceX); // 不可直接取用 MyOuter 的物件變數
            System.out.println(MyOuter.staticX); // 可直接取用 MyOuter 的類別變數
        }
    }
    
}