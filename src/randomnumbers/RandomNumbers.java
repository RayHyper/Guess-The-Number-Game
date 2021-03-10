package randomnumbers;
import java.util.Scanner;
import java.util.Random;
public class RandomNumbers {
   
    public static void main(String[] args) {
        
        //objects
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        String playAgain = "y";
        
        while(playAgain.equals("y") || playAgain.equals("Y"))
        {    
        
            //variables
            int answer = random.nextInt(20)+ 1; 
            int guesses = 9;
            int playerGuess;

            System.out.println("-------------------------------");
            System.out.println("|Guess the Number Game!       |");
            System.out.println("|Guess the number between 1-20|");
            System.out.println("|You have 10 guesses!         |");
            System.out.println("-------------------------------");
        
            while(guesses > -1)
            {
                System.out.println("---------------------------");
                System.out.print("Your guess is: ");
                playerGuess = input.nextInt();

                if(playerGuess == answer)
                {
                    System.out.println("You are right!");
                    guesses = guesses - 10;
                }
                else if(playerGuess != answer)
                {
                    if(playerGuess > answer)
                    {
                        System.out.println("Too High!");
                    }
                    else if(playerGuess < answer)
                    {
                        System.out.println("Too Low!");
                    }
                    System.out.println("You have " + guesses + " guesses left!\n");
                    guesses--;
                }
            }
            
            System.out.println("Play Again? (Y/N)");
            input.nextLine();
            playAgain = input.nextLine();
        }
        System.out.println("Have a good day!");
        
    }
    
}
