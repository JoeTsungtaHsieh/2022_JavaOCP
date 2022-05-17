package day17_exception;



public class LoginPageDemo {
    public static void main(String[] args) {
        String username = "admin";
        String password = "12345";
        
        LoginService loginService = new LoginService();
        try {
            boolean check = loginService.login(username, password);
            if(check) {
                System.out.println("登入成功");
            }
        } catch (LoginException ex) {
            System.out.println(ex);
            System.out.println(ex.getMessage());
            ex.forgotMyPassword();
            ex.forgotMyUsername();
        }
    }
}
