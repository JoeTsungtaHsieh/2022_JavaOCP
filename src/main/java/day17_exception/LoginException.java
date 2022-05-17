package day17_exception;

public class LoginException extends Exception{

    public LoginException(String string) {
        super(string);
    }
    
    public void forgotMyPassword(){
        System.out.println("請輸入 email 來取得密碼");
    }
    
    public void forgotMyUsername(){
        System.out.println("請輸入 phone 來取得帳號");
    }
}
