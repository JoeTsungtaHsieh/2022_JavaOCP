package day11_inner2;

public class LoginForm {
    private String userName;

    public LoginForm(String userName) {
        this.userName = userName;
        auto(); //調用自動登入
    }
    
    public void auto() {
        String title = "自動登入"; // 區域變數
        // 此 Button 是auto() 方法所獨享的
        // 方法內部類別
        class Button { //不可以加入權限的修飾字
            void action() {
                System.out.println(userName);
                // 因方法內部類別有使用title區域變數 
                // title區域變數在編譯時會自動加上 final 修飾
                System.out.println(title);
            }
        }
        Button button = new Button(); //自己new出Button物件
        button.action();
    }
    
}
