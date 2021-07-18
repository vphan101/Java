public class BankAccountTest {
    public static void main(String[] args){
        BankAccount BA = new BankAccount();

        BA.depositMoney(25, "checking");
        System.out.println(BankAccount.totalHoldings);//15
        BA.depositMoney(40, "savings");

        BA.withdrawMoney(8, "checking");
        BA.withdrawMoney(9, "savings");
        System.out.println(BankAccount.totalHoldings);//15 + 40 - 8 - 9=38.0

        BA.displayAccountBalance();
    }

}
