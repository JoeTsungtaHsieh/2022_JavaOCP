package day01;

public class AccountMain2 {
    public static void main(String[] args) {
         Account ac1 = new Account();
        ac1.name = "A01";
        ac1.deposit(100);
        System.out.printf("%s $%d\n",ac1.name,ac1.balance);
        ac1.deposit(50);
        System.out.printf("%s $%d\n",ac1.name,ac1.balance);
        ac1.deposit(10);
        System.out.printf("%s $%d\n",ac1.name,ac1.balance);
    }
}
