package rs222kn_assign1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by richardsoderman on 2016-08-30.
 */
public class LargestK {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inputNumber = 0;
        System.out.print("Enter number: ");
        inputNumber = Integer.parseInt(reader.readLine());
        //System.out.println(inputNumber);
        /*try {
        } catch (Exception e){
            System.out.println("Must be a number");
        }*/

        int k = 0;
        int sum = 0;

        while(inputNumber >= (sum + k + 2)){
            k += 2;
            sum += k;
        }

        System.out.println("LargestK: " + k);
    }
}
