package rs222kn_assign1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by richardsoderman on 2016-09-06.
 */
public class CountJava {
    public static void main(String[] args) throws IOException {
        doFileCount(args[0]);
    }

    static void doFileCount(String path) throws FileNotFoundException {
        File root = new File(path);
        File[] listOfFiles = root.listFiles();
        int numberOfFiles = 0;

        if(listOfFiles == null){
            System.out.println("directory should not be emty");
            System.exit(0);
        }

        try{
            for (File file : listOfFiles) {
                if (file.isDirectory()) {
                    doFileCount(file.getAbsolutePath());
                }else if(file.getName().toLowerCase().endsWith(".java")){
                    numberOfFiles++;
                    System.out.print(numberOfFiles + " " + file.getName());
                    System.out.println("\t lines = " + getNumberOfLines(file));
                }
            }
        }
        catch(Exception e) {
            System.exit(0);
        }
    }

    private static int getNumberOfLines(File file) throws FileNotFoundException{
        Scanner scanner = new Scanner(file);
        int numberOfLines = 0;
        while(scanner.hasNextLine()){
            numberOfLines++;
            scanner.nextLine();
        }
        scanner.close();
        return numberOfLines;
    }
}
