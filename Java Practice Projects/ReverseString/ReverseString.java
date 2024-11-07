package ReverseString;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a String to be reversed!");
        String input = scan.nextLine();
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.substring(i, i + 1);
        }
        System.out.println(output);
    }
}
