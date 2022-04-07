package day06_oo;
// 父子類建構子調用
class Father {
    Father() {
        System.out.println("F1");
    }
    Father(int age) {
        this();
        System.out.println("F2, age:" + age);
    }
}

class Son extends Father {
    Son() {
        this(18);
        System.out.println("S1");
    }
    Son(int age) {
        super(age);
        System.out.println("S2, age:" + age);
    }
}

public class Family {
    public static void main(String[] args) {
        Son son = new Son();
    }
}
