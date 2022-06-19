import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Random generator = new Random();
        int randomNum = generator.nextInt(10)+1;
        int userGuess = 0;
        String trash = "";

        Scanner in = new Scanner(System.in);

        System.out.println("The computer generated a random number from 1-10!");
        System.out.print("Guess the number: ");
        if (in.hasNextInt())
        {
            userGuess = in.nextInt();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Muster enter a valid integer! You entered: " + trash);
            System.out.println("Please restart the program and enter a valid integer!");
            System.exit(0);
        }

        if (userGuess == randomNum)
        {
            System.out.println("Winner Winner Chicken Dinner! Your guess is correct, the random number was: " + randomNum);
        }
        else if (userGuess > randomNum)
        {
            System.out.println("Your guess was too high!");
            System.out.println("The random number was: " + randomNum);
        }
        else
        {
            System.out.println("Your guess was too low!");
            System.out.println("The random number was: " + randomNum);
        }
    }
}
