package day01;

public class AccountMain3 {
    public static void main(String[] args) {
         Account ac1 = new Account();
        ac1.name = "A01";
        // 存款 100 元
        ac1.deposit(100);
        ac1.print();
        // 提款 30 元
        ac1.withdrawal(30);
        ac1.print();
    }
}
