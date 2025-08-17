package encapsulationPractice;

import java.util.Scanner;

class Customer {
    private int bal = 5000;
    private int pass = 1234;
    int chnagePassCount = 0;

    public void deposit(int amount) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the correct Password: ");
        int password = sc.nextInt();
        if (pass == password) {
            if (amount > 0) {
                bal += amount;
                System.out.println("your amount " + amount + " Successfully deposit in your bank account.");
                System.out.println("Your total balance is: " + bal);
            } else {
                System.out.println("Enter the valid amount");
            }
        } else {
            System.out.println("Your password is incorrect..");
        }
    }

    public void withdraw(int amount) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the correct Password: ");
        int password = sc.nextInt();
        if (pass == password) {
            if (amount > 0 && amount < bal) {
                bal -= amount;
                System.out.println("your amount " + amount + " Successfully withdraw from your bank account.");
                System.out.println("Your total balance remain is: " + bal);
            } else {
                System.out.println("Enter valid amount or insufficient balance");
            }
        } else {
            System.out.println("Your password is incorrect..");
        }
    }

    public void checkBal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the correct Password: ");
        int password = sc.nextInt();
        if (pass == password) {
            System.out.println("Your total balance is " + bal + " in your bank account.");
        } else {
            System.out.println("Your password is incorrect..");
        }
    }

    public void chnagePass() {
        if (chnagePassCount < 4) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the previous password: ");
            int prevPass = sc.nextInt();
            if (prevPass == pass) {
                System.out.print("Enter the new pass: ");
                int newPass = sc.nextInt();
                System.out.print("Enter the confirm pass: ");
                int cnfmPass = sc.nextInt();
                if (newPass == cnfmPass) {
                    System.out.println("You have successfully chnage your password.");
                } else {
                    System.out.println("Confirm password does not match the new password.");
                    System.out.println("You have the only one chnce, after that u need to enter the new password again.");
                    System.out.print("Enter the confirm pass: ");
                    cnfmPass = sc.nextInt();
                    if (newPass == cnfmPass) {
                        System.out.println("You have successfully chnage your password.");
                    } else {
                        System.out.println("You reach the limit of seting the confim password.");
                        chnagePass();
                    }
                }
            } else {
                chnagePassCount++;
                System.out.println("You entering the wrong previous password " + chnagePassCount + " times");
                System.out.println((4 - chnagePassCount) + " Attempts remain...");
                chnagePass();

            }
        } else {
            System.out.println("You reach the limit of changing the password.\nTry after sometime....");
        }

    }
}


    public class BankingSystem {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Customer c1 = new Customer();
            boolean t = true;
            while (t){
                System.out.println("Enter your choice:\n1. Deposit Amount.\n2. Withdraw Amount.\n3. Check Balance.\n4. Change Password.\n5. Exit");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1 -> {
                        System.out.println("Enter your deposit amount");
                        int amount = sc.nextInt();
                        c1.deposit(amount);
                    }
                    case 2 -> {
                        System.out.println("Enter your withdraw amount");
                        int amount = sc.nextInt();
                        c1.withdraw(amount);
                    }
                    case 3 -> c1.checkBal();
                    case 4 -> {
                        c1.chnagePass();
                    }
                    case 5 -> {
                        System.out.println("Thanku sir/ma'am for using our service\nGive your feedback, Your feedback is valuable for us..");
                        System.out.println("Rate 1 to 5");
                        int rate = sc.nextInt();
                        if(rate >= 1 && rate <= 5){
                            System.out.println("Thanku. you giving us " + rate + " Star.");
                        }else{
                            System.out.println("Enter the correct number between 1 to 5");
                        }
                        t = false;
                    }
                    default -> System.out.println("Invalid choice..");
                }
            }
        }
    }
