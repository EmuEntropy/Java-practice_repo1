import java.util.Stack;

import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class CentStacker {
    public final int quarter = 25;
    public final int dime = 10;
    public final int nickel = 5;
    public final int penny = 1;
    public int totalBalance;
    public int totalpennyBalance;
    public int totalnickelBalance;
    public int totalpoppedBalance;
    Stack<Integer> pennies = new Stack<>();
    Stack<Integer> nickels = new Stack<>();
    Stack<Integer> dimes = new Stack<>();
    Stack<Integer> quarters = new Stack<>();

    // Method to add pennies to the stack
    public void addPennies(int count) {
        for (int i = 0; i < count; i++) {
            pennies.push(penny);
            totalBalance += penny;
        }
    }

    // Method to remove a penny from the stack
    public int removePenny() {
        if (!pennies.isEmpty()) {
            totalBalance -= pennies.pop();
            return penny;
        } else {
            System.out.println("No pennies left to remove!");
            return 0;
        }
    }

    public void addNickel(int count) {
        for (int i = 0; i < count; i++) {
            nickels.push(nickel);
            totalBalance += nickel;
        }
    }

    public int removeNickel() {
        if (!nickels.isEmpty()) {
            totalBalance -= nickels.pop();
            return nickel;
        } else {
            System.out.println("No nickels left to remove!");
            return 0;
        }
    }
    public void totalbalance(Stack<Integer> stack) {
        for (int i = 0; i < stack.size(); i++) {
            
        }
    }
    public static void main(String[] args)  {
   
  }
}


