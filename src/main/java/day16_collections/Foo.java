package day16_collections;

@FunctionalInterface
// 只能有一個'自定義'抽象方法要實作
// 但是不包括 Object 方法
// 也不包括 default 方法
// 不包括 static 方法
public interface Foo {
    void bar();
    public boolean equals(Object c); // 隸屬於物件方法
    default void copyRight() {
        System.out.println("版權所有....");
    }
    public static void hello() {
        System.out.println("Hello...");
    }
    
}
