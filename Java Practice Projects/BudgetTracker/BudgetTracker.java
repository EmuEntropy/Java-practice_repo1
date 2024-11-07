package BudgetTracker;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class BudgetTracker {
    double totalfunds;
    double annualsubtract;
    double weekylsubtract;
    double dailysubtract;
    double monthlysubtract;
    ArrayList<String> namearraylist;
    ArrayList<Double> valuearraylist;

    public static void main(String[] args) {
        System.out.println("Please input your annual income.");
        Scanner scan = new Scanner(System.in);
        double annualincomeinput = scan.nextDouble();
        BudgetTracker budget = new BudgetTracker(annualincomeinput);
        budget.commands();
    }

    public BudgetTracker(double x) {

        namearraylist = new ArrayList<String>();
        valuearraylist = new ArrayList<Double>();
        totalfunds = 0.0;
        annualsubtract = 0.0;
        weekylsubtract = 0.0;
        dailysubtract = 0.0;
        monthlysubtract = 0.0;
    }

    public void addValueToannualSubtract(String name, double value) {
        
        namearraylist.add(name);
        valuearraylist.add(value);

    }

    public void removeValueFromannualSubtract(String name) {
        for (int i = 0; i < namearraylist.size(); i++) {
            if (name.equals(namearraylist.get(i))) {
                valuearraylist.remove(valuearraylist.get(i));
            }
        }
        namearraylist.remove(name);
    }

    public double getDailySubtract() {
        return (totalSubtract() / 365.0);
    }

    public double getWeeklySubtract() {
        return (totalSubtract() / 52.140);
    }

    public double getMonthlySubtract() {
        return (totalSubtract() / 12.0);
    }

    public double getYearlySubtract() {
        return totalSubtract();
    }

    public void commands() {
        Scanner scan = new Scanner(System.in);
        String getDaily = "getdaily";
        String getWeekly = "getweekly";
        String getMonthly = "getmonthly";
        String getYearly = "getyearly";
        String annnualexpense = "annualexpense";
        String addentry = "addentry";
        String removeentry = "removeentry";
        System.out.print("Type: 'AddEntry' to add an entry to your Budget Tracker, Type 'RemoveEntry' to remove");
        System.out.print(
                " an entry from your Budget Tracker, type 'get' followed by 'daily' 'weekly' 'monthly' 'yearly' to get");
        System.out.println(
                " the total amount being subtracted in that frequency from your account, type 'annualexpense' to get a list of all your annual expenses: ");
        String scannedinput = scan.nextLine();
        scannedinput = scannedinput.toLowerCase();
        if (scannedinput.equals(getDaily)) {
            System.out.println(getDailySubtract() + " USD");
            commands();
        } else if (scannedinput.equals(getWeekly)) {
            System.out.println(getWeeklySubtract() + " USD");
            commands();
        } else if (scannedinput.equals(getMonthly)) {
            System.out.println(getMonthlySubtract() + " USD");
            commands();
        } else if (scannedinput.equals(getYearly)) {
            System.out.println(getYearlySubtract() + " USD");
            commands();
        } else if (scannedinput.equals(annnualexpense)) {
            listofannualexpenses();
        } else if (scannedinput.equals(addentry)) {
            System.out.println("Type Name of the thing you want to add");
            String inputone = scan.nextLine();
            System.out.println("Type annual cost of the thing you want to add");
            double inputtwo = scan.nextDouble();
            addValueToannualSubtract(inputone, inputtwo);
            commands();
        } else if (scannedinput.equals(removeentry)) {
            System.out.println("Type Name of the thing you want to remove");
            String inputthree = scan.nextLine();
            removeValueFromannualSubtract(inputthree);
            commands();
        } else {
            System.out.println("There was an Error! Please try again!");
            commands();
        }

    }

    public double totalSubtract() {
        double total = 0.0;
        for (int i = 0; i < valuearraylist.size(); i++) {

            total += valuearraylist.get(i);
        }
        return total;
    }

    public void listofannualexpenses() {
        for (int i = 0; i < valuearraylist.size(); i++) {
            System.out.print("Product Name: " + namearraylist.get(i));
            System.out.println(", Annual Product Cost: " + valuearraylist.get(i));
        }
        commands();
    }
}
