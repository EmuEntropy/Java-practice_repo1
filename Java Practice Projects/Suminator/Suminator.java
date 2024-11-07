package Suminator;
// Sum A + B (w/ User input!)

import java.util.Scanner;

public class Suminator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Input Two Doubles!");
        double variableA = scan.nextDouble();
        double variableB = scan.nextDouble();
        System.err.print("Sum is equal to: ");
        System.out.println((variableA + variableB));
    }
}
