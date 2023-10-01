import java.util.Scanner;

public class Task3_ATM_Interface {
    public static class Account{
        private double balance=0.0;
        public double getBalance(){
            return this.balance;
        }
        public void setBalance(double balance){
            this.balance = balance;
        }
    }
    
    public static void main(String[] args) {
        Account ac=new Account();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
        System.out.println("\t\t\t\t\t\t APNA ATM\n");
         System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
        userInterface(ac);
    }
    public static void userInterface(Account ac){
        System.out.println("Press 1 for Withdraw \nPress 2 for Deposit \nPress 3 for Check Balance");
        Scanner sc=new Scanner(System.in);
        int userChoose=sc.nextInt();
        if(userChoose==1){
            withdraw(ac);
        }else if(userChoose==2){
            deposit(ac);
        }else if(userChoose==3){
            checkBalance(ac);
        }else{
            System.out.println("please select valid option!\n");
        } 
    }
    public static void withdraw(Account ac){
        // Account ac =new Account();
        Scanner wsc = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw : ");
        double withdrawAmount = wsc.nextDouble();
        if(withdrawAmount>ac.getBalance()){
            System.out.println("Transaction failure!\nYou don't have enough balance to withdraw\n");
            moreTransactions(ac);
        }else{
            double newBalance = ac.getBalance() - withdrawAmount;
            ac.setBalance(newBalance);
            System.out.println("Withdraw successful!\n");
            moreTransactions(ac);
        }  
    }
    public static void deposit(Account ac){
        // Account ac=new Account();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the amount to deposit : ");
        double depositAmount = sc.nextInt();
        double newBalance = ac.getBalance()+depositAmount;
        ac.setBalance(newBalance);
        System.out.println("\nSuccessfully deposit!\n");
        moreTransactions(ac);
    }
    public static void checkBalance(Account ac){
        // Account ac = new Account();
        System.out.println("\nAvailable Balance : "+ac.getBalance());
        moreTransactions(ac);
    }
    public static void moreTransactions(Account ac){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nIf you want more transactions than press 'y' to continue other press 'n' to exit");
        String wantMoreTransaction=sc.next();
        if(wantMoreTransaction.equals("y") || wantMoreTransaction.equals("Y")){
            userInterface(ac);
        }else{
            System.out.println("Thanks! for using our ATM\n");
        }
    }
}
