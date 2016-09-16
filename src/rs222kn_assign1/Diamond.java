package rs222kn_assign1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by richardsoderman on 2016-08-31.
 */
public class Diamond {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input number: ");
        int inputNumber = 0;

        try {
            inputNumber = Integer.parseInt(reader.readLine());
            if(inputNumber % 2 == 0 || inputNumber < 0){
                System.out.println("Must me valid posivive odd number");
                System.exit(0);
            }
        }catch(Exception e){
            System.out.println("Must me valid number");
            System.exit(0);
        }

        for(int i = 0; i < inputNumber; i++){

            if(i > (inputNumber / 2)){

                for (int k = 1; k <= 1 + i; k++) {
                    System.out.print(" ");
                }

                for (int j = inputNumber - i; j >= -inputNumber + 2 + i; j--) {
                    System.out.print("*");
                }

            }else {
                for (int k = inputNumber; k > i; k--) {
                    System.out.print(" ");
                }

                for (int j = 0; j <= (i == 0 ? i : i * 2); j++) {
                    System.out.print("*");
                }
            }

            System.out.println("");
        }
    }
}
