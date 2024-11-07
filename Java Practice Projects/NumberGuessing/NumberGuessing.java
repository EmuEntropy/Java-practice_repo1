package NumberGuessing;
import java.util.Scanner;
import java.lang.Math;

public class NumberGuessing {

    public static void main(String[] args) {
    
    
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "This is a number guessing game, please enter a number between 1 and 10. If you guess correctly, i'll give a little reward ;)");
        int thecorrectnumber = (int) (Math.random() * ((10 - 1) + 1));
        int guessednumber = scan.nextInt();
        boolean correctguess = false;

    while(correctguess == false)
    {
        if (guessednumber == thecorrectnumber) {
            System.out.println("You Got it!");
            correctguess = true;
            System.out.println("Heres your reward!");
            System.out.println("WWWWWWWWW");
                    
        } else {
            System.out.println("You got the wrong number!");
            System.out.println("Try Again!");
            guessednumber = scan.nextInt();

        }
    }
    }

}
