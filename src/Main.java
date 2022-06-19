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
        
    }
}
