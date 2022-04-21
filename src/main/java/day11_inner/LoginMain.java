package day11_inner;

public class LoginMain {
    public static void main(String[] args) {
        // 在登入表單中輸入 John
        LoginForm loginForm = new LoginForm("John");
        // 按下登入按鈕
        LoginForm.Button button = loginForm.new Button();
        button.action();
        
        // 在登入表單中輸入 Mary 後就直接按下按鈕後登入
        LoginForm.Button button2 = new LoginForm("Mary").new Button();
        button2.action();
        
        // 在登入表單中輸入 Helen 後就直接按下按鈕後直接登入
        new LoginForm("Helen").new Button().action();
        
        
    }
}
