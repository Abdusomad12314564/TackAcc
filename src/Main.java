public class Main {
    public static void main(String[] args) {

        Account acc=new Account();
        acc.fullName="АбдуСомад Кошмаматов: ";
        System.out.println(acc.fullName+" Ваш баланс: "+Account.deposit(300)+" сом");
        System.out.println(acc.fullName+" Ваш баланс: "+Account.withdrawal(400)+" сом");


        Account acc2=new Account();
        acc.fullName="Чыңгыз Шаршекеев: ";
        System.out.println(acc.fullName+" Ваш баланс: "+Account.deposit(1000)+" сом");
        System.out.println(acc.fullName+" Ваш баланс: "+Account.withdrawal(800)+" сом");

        Account acc3=new Account();
        acc.fullName="Темирлан Жузукулов: ";
        System.out.println(acc.fullName+" Ваш баланс: "+Account.deposit(100)+" сом");
        System.out.println(acc.fullName+" Ваш баланс: "+Account.withdrawal(600)+" сом");

    }
}