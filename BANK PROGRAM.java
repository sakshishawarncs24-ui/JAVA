import java.util.Scanner;

class Account {
    String customerName;
    int accountNumber;
    String accountType;
    double balance;

    void getAccountDetails() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        customerName = s.next();
        System.out.print("Enter account Number: ");
        accountNumber = s.nextInt();
        System.out.print("Enter type of account (saving/current): ");
        accountType = s.next();
        balance = 0;  
    }

    void display() {
        System.out.println("Customer name: " + customerName);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Type of Account: " + accountType);
        System.out.println("Balance = " + balance);
    }
}

class Sav_acct extends Account {
    void deposit() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the deposit amount: ");
        double amount = s.nextDouble();
        balance += amount;
    }

    void withdraw() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the withdrawal amount: ");
        double amount = s.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
        }
    }

    void computeInterest() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the rate of interest: ");
        double rate = s.nextDouble();
        System.out.print("Enter the time period (years): ");
        int time = s.nextInt();

        double interest = balance * Math.pow((1 + rate / 100), time) - balance;
        balance += interest;
        System.out.println("Interest added = " + interest);
    }
}

class Cur_acct extends Account {
    final double minBalance = 500; 
    final double serviceCharge = 100;

    void deposit() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the deposit amount: ");
        double amount = s.nextDouble();
        balance += amount;
    }

    void withdraw() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the withdrawal amount: ");
        double amount = s.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            checkMinBalance();
        }
    }

    void checkMinBalance() {
        if (balance < minBalance) {
            balance -= serviceCharge;
            System.out.println("Balance below minimum! Service charge of Rs." + serviceCharge + " imposed.");
        }
    }
}

public class MainBank {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Sav_acct sav = new Sav_acct();
        Cur_acct cur = new Cur_acct();

        System.out.print("Enter customer name: ");
        sav.customerName = s.next();
        System.out.print("Enter account Number: ");
        sav.accountNumber = s.nextInt();
        sav.accountType = "saving"; 

        System.out.print("Enter customer name: ");
        cur.customerName = s.next();
        System.out.print("Enter account Number: ");
        cur.accountNumber = s.nextInt();
        cur.accountType = "current";

        int choice;
        do {
            System.out.println("\n-----MENU-----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Compute interest for SavingsAccount");
            System.out.println("4. Display account details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the type of account: ");
                    String type = s.next();
                    if (type.equalsIgnoreCase("saving"))
                        sav.deposit();
                    else
                        cur.deposit();
                    break;

                case 2:
                    System.out.print("Enter the type of account: ");
                    type = s.next();
                    if (type.equalsIgnoreCase("saving"))
                        sav.withdraw();
                    else
                        cur.withdraw();
                    break;

                case 3:
                    sav.computeInterest();
                    break;

                case 4:
                    System.out.print("Enter the type of account: ");
                    type = s.next();
                    if (type.equalsIgnoreCase("saving"))
                        sav.display();
                    else
                        cur.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }
}