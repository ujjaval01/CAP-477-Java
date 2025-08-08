import java.util.Scanner;

class Customer{
    private int bal = 5000;
    private final int pass = 1234;

    int getBal(){
        return bal;
    }

    public void deposit(int amount){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the correct Password: ");
        int password = sc.nextInt();
        if(pass == password){
            if(amount > 0){
                bal +=amount;
                System.out.println("your amount "+ amount + " Successfully deposit in your bank account.");
                System.out.println("Your total balance is: " + bal);
            }else{
                System.out.println("Enter the valid amount");
            }
        }
        else {
            System.out.println("Your password is incorrect..");
        }
    }
    public void withdraw(int amount){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the correct Password: ");
        int password = sc.nextInt();
        if(pass == password){
            if(amount > 0 && amount <bal){
                bal -=amount;
                System.out.println("your amount "+ amount + " Successfully withdraw from your bank account.");
                System.out.println("Your total balance remain is: " + bal);
            }
            else {
                System.out.println("Enter valid amount or insufficient balance");
            }
        }
        else{
            System.out.println("Your password is incorrect..");
        }
    }
    public void checkBal(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the correct Password: ");
        int password = sc.nextInt();
        if(pass == password){
            System.out.println("Your total balance is " + bal + " in your bank account.");
        }
        else{
            System.out.println("Your password is incorrect..");
        }

    }
}


class BankingSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer c1 = new Customer();
//        int res = c1.getBal();
//        System.out.println(res);
        System.out.println("Enter your choice:\n1. Deposit Amount.\n2. Withdraw Amount.\n3. Check Balance.");
        int ch = sc.nextInt();
        switch (ch){
            case 1 ->{
                System.out.println("Enter your deposit amount");
                int amount = sc.nextInt();
                c1.deposit(amount);
            }
            case 2 ->{
                System.out.println("Enter your withdraw amount");
                int amount = sc.nextInt();
                c1.withdraw(amount);
            }
            case 3 ->  c1.checkBal();
            default -> System.out.println("Invalid choice..");
        }
//
//        c1.withdraw(1000);
//        c1.checkBal();
    }
}