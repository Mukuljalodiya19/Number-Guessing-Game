package project1;

    import java.util.Scanner;
import java.util.Random;

    public class NumberGuessingGame {
        public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);
            Random random = new Random();

            int lowerBound = 1;
            int upperBound = 100;
           int maxAttempts = 8;
           int score = 0;
           boolean playAgain = true;

            System.out.println("-------Welcome to the Number Guessing Game!!!!-------");

            while(playAgain){

                int numberToGuess = random.nextInt(100)+1;
                int attempts = 0;
                boolean guessedCorrectly = false;

                System.out.println("I have selected a number between "+ lowerBound + " and " + upperBound);
                System.out.println("You have " + maxAttempts + " attempts to guess the number");

                while(attempts < maxAttempts){
                    System.out.println("Enter your guess number: ");
                    int Guess = kb.nextInt();
                       if (Guess >= lowerBound && Guess<= upperBound){
                    System.out.println(Guess);
                } else  {
                    System.out.println("Please enter a number between the given range.");
                }
                    attempts++;

                    if (Guess == numberToGuess){
                        System.out.println("You Won!!!! You Guessed the number in " + attempts + " attempts.");
                        score =  score+(maxAttempts - attempts + 1)*10;
                        guessedCorrectly = true;
                        break;
                    } else if (Guess < numberToGuess) {
                        System.out.println("Too low!!");
                    }else {
                        System.out.println("too high!!");
                    }
                }
                if (!guessedCorrectly){
                    System.out.println("You've used all attempts.");
                    System.out.println("Sorry you failed to guess the number!!!");
                    System.out.println("The correct number was: " + numberToGuess);
                }
                System.out.println("Current Score: "+score);

                System.out.println("Do you want to play again ? (yes/no): ");
                String choice = kb.next().toLowerCase();

                if (!choice.equals("yes")) {
                    playAgain = false;
                }
            }

            System.out.println("Thank you for playing Game!!!!");
            System.out.println("your Final Score :" + score);
            }

        }
