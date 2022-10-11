import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int guess = 0;
        int com = rand.nextInt(0, 10)+1;

        System.out.println("Enter your guess: ");
        if (in.hasNextInt())
        {
            guess = in.nextInt();
            if (guess < com)
            {
                System.out.println("You guessed less the computer picked " +com);
            }
            if (guess > com)
            {
                System.out.println("You guessed High the computer picked " +com );
            }
            if (guess == com)
            {
                System.out.println("You guessed correct! the computer picked " +com );
            }
        }
        else
        {
            System.out.println("Not a valid input");
            System.exit(0);
        }






    }
}