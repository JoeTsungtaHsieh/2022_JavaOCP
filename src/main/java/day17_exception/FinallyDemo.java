package day17_exception;

public class FinallyDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        int result = 0;
        
        try {
            result = x / y;
            System.out.println("result=" + result);
            System.exit(0); //  強迫離開 (不會執行 finally)
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            return; // 方法中止
        } finally {

            System.out.println("程式結束"); // 一定要執行
        }
    }
}
