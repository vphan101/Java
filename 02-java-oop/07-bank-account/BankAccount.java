import java.util.Random;

public class BankAccount {
    public static int numOfAccounts = 0;
    public static double totalHoldings = 15;
    private static String createId() {
        String subst = "";
        Random r = new Random();
        for(int i = 0; i < 10; i++) {
            subst += r.nextInt(10);
        }
        return subst;
    }

    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;

    public BankAccount() {
        this.numOfAccounts +=1;
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        this.accountNumber = BankAccount.createId();
    }

    //Getters...don't have to have setters
   public double getCheckingBalance(){
       return this.checkingBalance;
   }
   public double getSavingsBalance(){
       return this.savingsBalance;
   }

   //Methods
   public void depositMoney(double amount, String account){
        if(account.equals("checking")){
            this.checkingBalance +=amount;
            System.out.println("The checking is: " + this.checkingBalance);
            System.out.println("The savings is: " + this.savingsBalance);
        }
        else if(account.equals("savings")){
            this.savingsBalance +=amount;
            BankAccount.totalHoldings +=amount;
            System.out.println("The checking is: " + this.checkingBalance);
            System.out.println("The savings is: " + this.savingsBalance);
        }      
   }

   public void withdrawMoney(double amount, String account){
       boolean success = false;

       if(account.equals("checking")){
           if(this.checkingBalance - amount >=0){
               success = true;
               this.checkingBalance -=amount;
               System.out.println("checking is now after withdrawal: " + this.checkingBalance);
           }
       }
       else if(account.equals("savings")){
           if(this.savingsBalance - amount >=0){
               success = true;
               this.savingsBalance -=amount;
               System.out.println("savings is now after withdrawal: " + this.savingsBalance);
           }
       }
       if(success){
           BankAccount.totalHoldings -=amount;
       }   
       
   }

   public void displayAccountBalance(){
    System.out.println("Checking: " + this.checkingBalance + " and " + "savings: " + this.savingsBalance);
   } 









}