package rs222kn_assign1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by richardsoderman on 2016-08-30.
 */
public class HighLow {
    public static void main(String[] args) throws IOException {

        Random random = new Random();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inputNumber = 0;
        int nrOfGuesses = 0;
        int secretNumber = random.nextInt(100) + 1;
        System.out.println("secretNumber: " + secretNumber);

        do {
            nrOfGuesses++;

            System.out.print("Guess: " + nrOfGuesses + ": ");
            inputNumber = Integer.parseInt(reader.readLine());

            if(nrOfGuesses == 10){
                System.out.println("You failed the secret number was: " + secretNumber );
                break;
            }else if(inputNumber > secretNumber){
                System.out.println("Hint: lower");
            }else if(inputNumber < secretNumber){
                System.out.println("Hint: higher" );
            }else {
                System.out.println("Correct after only " + nrOfGuesses + " guesses - Brilliant!");
                break;
            }
        } while(true);

    }
}
