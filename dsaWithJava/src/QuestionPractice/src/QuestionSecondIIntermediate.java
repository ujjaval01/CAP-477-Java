package QuestionPractice.src;

import java.util.Scanner;

class BankAccount{
    private final String accountHolder;
    private final long accountNumber;
    private double balance;

    BankAccount(String accountHolder, long accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
        System.out.println("You deposit " + amount + " Rupees");
        if(amount > 0){
            balance+=amount;
        }else {
            System.out.println("You deposit the wrong type of amount");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            System.out.println("You successfully withdraw " + amount + " Rupees, ");
            balance -= amount;
        }else {
            System.out.println("Inefficient balance or entering wrong type of amount, check again");
        }
    }
    public void displayInfo(){
        System.out.println("Account holder name: " + accountHolder);
        System.out.println("Account number: " + accountNumber);
        System.out.print("Total balance is: " + balance);

    }
}

public class QuestionSecondIIntermediate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b1 = new BankAccount("Ujjaval", 9045229266L, 10000);
        System.out.print("Enter the deposit amount: ");
        double deposit = sc.nextDouble();
        b1.deposit(deposit);
        System.out.print("Enter the withdraw amount: ");
        double withdraw = sc.nextDouble();
        b1.withdraw(withdraw);

        b1.displayInfo();


/*
         System.out.println("Enter your choice\n1. Check Account Info\n2. Deposit Amount\n3. Withdraw Amount");
         int choice = sc.nextInt();
         switch (choice){
             case 1-> b1.displayInfo();
             case 2 -> {
                 System.out.print("Enter the deposit amount: ");
                 double amount = sc.nextDouble();
                 b1.deposit(amount);
             }
             case 3->{
                 System.out.print("Enter the withdraw amount: ");
                 double amount = sc.nextDouble();
                 b1.withdraw(amount);
             }
 }
*/
    }
}
