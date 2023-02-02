public class Account {
    String fullName;
    static double balance = 1000;

    static double  deposit(int plus){
        return balance+plus;
    }
    static double withdrawal(int minus){
        return balance-minus;
    }
}
