package day01;

// 帳戶
public class Account {

    String name; //戶名
    int balance; // 帳戶餘額
    
    static void transfer(int amount, Account act1, Account act2) {
        act1.withdrawal(amount);
        act2.deposit(amount);
    }
    
    // 轉帳程序
    // amount: 轉帳金額
    // act: 轉帳對象
    void transfer(int amount, Account act){
        withdrawal(amount);
        act.deposit(amount);
    }
    // 存款的程序(存款方法)
    // amount: 存款金額
    public void deposit(int amount) {
        if(amount <= 0 ){
            System.out.println("存款必須大於零");
            return; // 中斷方法
        }
        balance += amount;
    }

    // 提款的程序(提款方法)
    public void withdrawal(int amount) {
        if(amount <= 0 ){
            System.out.println("提款必須大於零");
            return; // 中斷方法
        }
        if(balance < amount) {
            System.out.println("餘額不足");
            return;
        }
         balance -= amount;
    }

    // 印出帳戶餘額
    public void print() {
        System.out.printf("%s $%,d\n", name, balance);
    }
}
