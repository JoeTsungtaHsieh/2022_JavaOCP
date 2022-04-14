package day09_oo;

// 自動變長參數若與一般方法產生衝突的調用說明
// 會先滿足一般方法
public class VarargDemo2 {
    public static void main(String[] args) {
        print("john");
        print("john", "Mary");
        // print("john", "Mary", "Helen");
        String[] names = {"Mary","Helen"};
        print(names);
        print("john", names);
    }
    
    public static void print(String name) {
        System.out.println("A");
    }
    
    public static void print(String name1, String name2) {
        System.out.println("B");
    }
    
    public static void print(String... names) {
        System.out.println("C");
    }
    
    public static void print(String name, String... names) {
        System.out.println("D");
    }
}
