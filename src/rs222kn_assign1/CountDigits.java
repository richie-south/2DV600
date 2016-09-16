package rs222kn_assign1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by richardsoderman on 2016-08-30.
 */
public class CountDigits {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inputNumber = 0;
        System.out.print("Enter number: ");
        inputNumber = Integer.parseInt(reader.readLine());
        String[] parts = (inputNumber + "").split("");

        int nrOfZeros = 0;
        int nrOfOdd = 0;
        int nrOfEven = 0;
        int sum = 0;
        for (int i = 0; i < parts.length; i++){

            int nr = Integer.parseInt(parts[i]);
            if(nr == 0){
                nrOfZeros += 1;
            }else if(nr % 2 == 0){
                nrOfEven += 1;
            }else {
                nrOfOdd += 1;
            }
            sum += nr;
        }
        System.out.println("Even: " + nrOfEven);
        System.out.println("Odd: " + nrOfOdd);
        System.out.println("Zero: " + nrOfZeros);
        System.out.println("Sum: " + sum);
    }
}
