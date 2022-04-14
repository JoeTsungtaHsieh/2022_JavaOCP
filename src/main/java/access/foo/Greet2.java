

package access.foo;

import access.bar.Hello;


public class Greet2 extends Hello{
    // 存取 Hello 的資源
    public void accessHello() {
        Greet2 hello = new Greet2();
        System.out.println(hello.a);
        System.out.println(hello.b);
        //System.out.println(hello.c);
        //System.out.println(hello.d); // 不可呼叫 private 方法
    }
}