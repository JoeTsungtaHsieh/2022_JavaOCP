package day11_inner;

//外部類別(表單)
public class LoginForm {

    private String userName;
    private String title = "登入表單"; // 表單抬頭

    public LoginForm(String userName) {
        this.userName = userName;
    }

    // 內部類別(按鈕)
    public class Button {

        private String title = "傳送"; // 按鈕抬頭
        // static int width = 200; // 屬性不可以加入 static 修飾
        // 行為

        public void action() {
            String title = "驗證成功"; // 行為抬頭
            System.out.println(LoginForm.this.title); // 得到 ->登入表單
            System.out.println(this.title); // 得到 -> 傳送
            System.out.println(title); // 傳送 ->  驗證成功
            System.out.println(userName + "登入了...");
        }
    }

}
