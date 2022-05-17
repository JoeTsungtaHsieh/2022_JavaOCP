package day17_exception;


public class ThrowDemo {

    public static void main(String[] args) {
        try {
            System.out.println(calc(10, 0));
        } catch (Exception ex) {
            try {
                System.out.println(ex);
                // 要用 line 回報給主管
                LineService lineService = new LineService();
                int statuscode = lineService.sendText(ex.getMessage());
                System.out.println(statuscode);
            } catch (Exception ex1) {
                System.out.println(ex1); 
            }
        }
    }

    public static int calc(int x, int y) throws Exception{
        if( y == 0) {
            // 創建一個 Exception 例外物件
            Exception e = new Exception("分母不可為 0");
            // 將例外物件拋出
            throw e;
        }
        int result = x / y;
        return result;

    }
}
