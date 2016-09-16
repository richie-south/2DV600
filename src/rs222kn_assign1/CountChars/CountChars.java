package rs222kn_assign1.CountChars;

import java.io.IOException;
import java.io.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileNotFoundException;

/**
 * Created by richardsoderman on 2016-09-04.
 */
public class CountChars {
    public static void main(String[] args) throws IOException {
        String content = "";
        if( args.length > 0) {
            content = getFileContent(args[0]);
        } else {
            System.out.println("Enter path to file");
            System.exit(0);
        }

        String[] parts = content.split("");

        int upperCase = 0;
        int lowerCase = 0;
        int whitespace = 0;
        int other = 0;
        int numbers = 0;

        for (int i = 0; i < parts.length; i++) {
            if(Character.isUpperCase(parts[i].charAt(0))){
                upperCase++;
            } else if(Character.isLowerCase(parts[i].charAt(0))) {
                lowerCase++;
            } else if(Character.isWhitespace(parts[i].charAt(0))){
                whitespace++;
            } else if(Character.isDigit(parts[i].charAt(0))){
                numbers++;
            } else{
                other++;
            }
        }

        System.out.println("Uppercases: " + upperCase);
        System.out.println("Lowercases: " + lowerCase);
        System.out.println("Whitespaces: " + whitespace);
        System.out.println("Other: " + other);
        System.out.println("Numbers: " + numbers);
    }

    private static String getFileContent(String path) throws IOException{
        try {
            return new String(Files.readAllBytes(Paths.get(path)));
        } catch (FileNotFoundException e) {
            System.exit(0);
        }
        return "";
    }
}