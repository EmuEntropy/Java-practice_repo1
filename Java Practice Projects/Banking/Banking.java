package Banking;

import java.util.Scanner;

public class Banking {
    double accountBalance;
    String userName = "";

    public void depositMoney(double depomoney) {
        accountBalance += depomoney;
    }

    public String withdrawMoney(double withdrawMoney) {
        if (accountBalance - withdrawMoney >= 0) {
            accountBalance -= withdrawMoney;
            return ("Complete");
        } else {
            return ("Balance to low");
        }
    }

    public double checkBalance() {
        return accountBalance;
    }

    public Banking(String user) {
        accountBalance = 0.0;
        userName = user;
    }
//fix prompt in string
    public void commands() {
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "Type: 'BALANCE' to check your balance, type: 'DEPOSIT' to check your current money amount, type: 'WITHDRAW' to withdraw money.");
        String cmdinput = scan.nextLine();
        cmdinput = cmdinput.toUpperCase();
        String balance = "BALANCE";
        String deposit = "DEPOSIT";
        String withdraw = "WITHDRAW";

        if (balance.equals(cmdinput)) {
            System.out.println(checkBalance());
            commands();
        } else if (deposit.equals(cmdinput)) {
            double cmddepo = scan.nextDouble();
            depositMoney(cmddepo);
            commands();
        } else if (withdraw.equals(cmdinput)) {
            double cmddraw = scan.nextDouble();
            System.out.println(withdrawMoney(cmddraw));
            commands();
        } else {
            System.out.println("Unable to complete, try again");
            commands();
        }
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert a username");
        String tempname = scan.nextLine();
        Banking bank = new Banking(tempname);
        System.out.println("balance: " + bank.checkBalance());
        bank.commands();

        scan.close();
    }

}

/*
 * String username;
 * double money;
 * Scanner scan = new Scanner(System.in);
 * 
 * public Banking(String enteredname, double enteredamount) {
 * username = enteredname;
 * money = enteredamount;
 * }
 * 
 * public double totalmoney() {
 * return money;
 * }
 * 
 * public String returnUN() {
 * return username;
 * }
 * 
 * public static String getCommands() {
 * return ("totalmoney, returnUN");
 * }
 * 
 * public static void main(String[] args) {
 * Scanner scanone = new Scanner(System.in);
 * System.out.
 * println("Hello!, would you like to enter the interface? (true/false)");
 * Boolean enterInterface = scanone.nextBoolean();
 * 
 * while (enterInterface == true) {
 * scanone.close();
 * Scanner scantwo = new Scanner(System.in);
 * System.out.
 * println("You don't have an account. Please create an account, enter your name."
 * );
 * String enteredname = scantwo.nextLine();
 * 
 * while (enteredname != null || enteredname != "") {
 * scantwo.close();
 * Scanner scanthree = new Scanner(System.in);
 * System.out.println(
 * "Name registered! Please enter an amount greater than 1.00 USD as a first time transaction."
 * );
 * Double enteredmoney = scanthree.nextDouble();
 * while (enteredmoney != null || !(enteredmoney <= 0.99)) {
 * scanthree.close();
 * System.out.
 * println("Account creation complete. Would you like to exit the interface? (y/n)"
 * );
 * String exitinterface = scanthree.nextLine();
 * while (exitinterface != null || exitinterface != "") {
 * if (exitinterface == "y") {
 * return;
 * } else {
 * System.out.println("Type 'Help' to see list of commands");
 * String enterhelp = scanthree.nextLine();
 * if (enterhelp == "Help") {
 * getCommands();
 * }
 * }
 * 
 * }
 * if (exitinterface == null || exitinterface == "") {
 * System.out.println("Please type y/n");
 * exitinterface = scanone.nextLine();
 * }
 * 
 * }
 * if (enteredmoney == null || !(enteredmoney <= 0.99)) {
 * System.out.println("Money must be greater than 1.00 USD");
 * enteredmoney = scanthree.nextDouble();
 * }
 * }
 * if (enteredname == null || enteredname == "") {
 * System.out.println("That's Not a valid name, please try again.");
 * enteredname = scantwo.nextLine();
 * }
 * }
 * 
 * }
 */
