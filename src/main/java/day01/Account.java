package day01;

// 帳戶
public class Account {
    String name; //戶名
    int balance; // 帳戶餘額
    // 存款的程序(存款方法)
    // amount: 存款金額
    public void deposit(int amount){
        balance += amount;
    }
}
