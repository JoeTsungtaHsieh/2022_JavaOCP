package day21;

// 提款的工作
public class Withdraw implements Runnable{
    private Account account;
    private int amount;
    public Withdraw(Account account, int amount){
        this.account = account;
        this.amount = amount;
    }
    @Override
    public void run() {
        // 執行提款程序
        account.withdraw(amount);
    }
    
}
