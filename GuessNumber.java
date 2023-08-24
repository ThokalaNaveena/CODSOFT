import java.util.Scanner;
import java.util.Random;
public class GuessNumber {
    private static final int MAX_NUM=100;
    private static final int MAX_ATTEMPTS=5;
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random r=new Random();
        int score=0;
        boolean playAgain=true;
        System.out.println("Wlcome to the Number Guessing Game!");
        while(playAgain){
            int targetNumber=r.nextInt(MAX_NUM)+1;
            System.out.println("\nI've picked a number between 1 and 100. Can You guessa it?");
            int attempts=0;
            while(attempts<MAX_ATTEMPTS){
                System.out.print("Enter your Guess: ");
                int userGuess=scanner.nextInt();
                if(userGuess == targetNumber){
                    System.out.println("Congratulations 1 You guessed the correct number");
                    score +=MAX_ATTEMPTS-attempts;
                    break;
                }else if(userGuess<targetNumber){
                    System.out.println("Too Low. Try again!"); 
                }
                else{
                    System.out.println("Too high. Try again!");
                }
                attempts++;
            }
            if(attempts== MAX_ATTEMPTS){
                System.out.println("Your current score: "+score);
                System.out.print("Do you want to play again?(yes/no):");
                String playAgainResponse=scanner.next().toLowerCase();
                //repeatAgain = repeatAgainResponse.equals(anObject: "yes");
                playAgain = playAgainResponse.equals( "yes");
            }
            System.out.println("/n Thnak you for playing the number guessing Game! Your final score:"+score);
            scanner.close();

        } 
    }
}
