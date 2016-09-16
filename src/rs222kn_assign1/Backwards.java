package rs222kn_assign1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backwards {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Type a line of text:");

        String text = reader.readLine();
        System.out.println("Backwards: " +  new StringBuilder(text).reverse().toString());
    }
}
