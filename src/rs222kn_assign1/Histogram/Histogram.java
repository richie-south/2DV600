package rs222kn_assign1.Histogram;

import com.sun.tools.javac.code.Attribute;
import com.sun.tools.javac.util.ArrayUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by richardsoderman on 2016-09-05.
 */
public class Histogram {
    public static void main(String[] args) throws IOException {

        if(args.length <= 0) {
            System.out.println("Enter path to file");
            System.exit(0);
        }


        int[] numbers = IntStream.of(
                convertArrayListIntegerToArray(
                    getNumbersFromFile(args[0])))
                .filter(Histogram::isLargerThanZeroAndSmallerThanTwoHundred)
                .sorted().toArray();

        int oneToOneHundred = 0;
        int oneToTen = 0; // 1  - 10
        int elevenToTwenty = 0; // 11 - 20
        int twentyOneToThirty = 0; // 21 - 30
        int thirtyOneToForty = 0; // 31 - 40
        int fortyOneToFifty = 0; // 41 - 50
        int fiftyOneToSixty = 0; // 51 - 60
        int sixtyOneToSeventy = 0; // 61 - 70
        int seventyOneToEighty = 0; // 71 - 80
        int eightyOneToNinety = 0; // 81 - 90
        int ninetyOneToOnehundred = 0;
        int houndredAndOneToTwohundred = 0;

        for(int number : numbers){
            if(number >= 101){
                houndredAndOneToTwohundred++;
            }else if(number >= 91){
                ninetyOneToOnehundred++;
                oneToOneHundred++;
            }else if(number >= 81){
                eightyOneToNinety++;
                oneToOneHundred++;
            }else if(number >= 71){
                seventyOneToEighty++;
                oneToOneHundred++;
            }else if(number >= 61){
                sixtyOneToSeventy++;
                oneToOneHundred++;
            }else if(number >= 51){
                fiftyOneToSixty++;
                oneToOneHundred++;
            }else if(number >= 41){
                fortyOneToFifty++;
                oneToOneHundred++;
            }else if(number >= 31){
                thirtyOneToForty++;
                oneToOneHundred++;
            }else if(number >= 21){
                twentyOneToThirty++;
                oneToOneHundred++;
            }else if(number >= 11){
                oneToOneHundred++;
                elevenToTwenty++;
            }else{
                oneToTen++;
            }
        }

        System.out.println("Reading integers from the file: " + args[0]);
        System.out.println("Number of integers in the interval [1,100]: " + oneToOneHundred);
        System.out.println("in the interval [101,200]: " + houndredAndOneToTwohundred);
        System.out.println();
        System.out.println("Histogram");
        System.out.println("1  - 10  | " + getStars(oneToTen));
        System.out.println("11 - 20  | " + getStars(elevenToTwenty));
        System.out.println("21 - 30  | " + getStars(twentyOneToThirty));
        System.out.println("31 - 40  | " + getStars(thirtyOneToForty));
        System.out.println("41 - 50  | " + getStars(fortyOneToFifty));
        System.out.println("51 - 60  | " + getStars(fiftyOneToSixty));
        System.out.println("61 - 70  | " + getStars(sixtyOneToSeventy));
        System.out.println("71 - 80  | " + getStars(seventyOneToEighty));
        System.out.println("81 - 90  | " + getStars(eightyOneToNinety));
        System.out.println("91 - 100 | " + getStars(ninetyOneToOnehundred));
        System.out.println("101 - 200| " + getStars(houndredAndOneToTwohundred));
    }

    private static boolean isLargerThanZeroAndSmallerThanTwoHundred(int i){
        return i > 0 && i <= 200;
    }
    
    private static String getStars(int nrOfStars){
        String stars = "";
        for (int i = 0; i < nrOfStars; i++) {
            stars += "*";
        }
        return stars;
    }

    private static ArrayList<Integer> getNumbersFromFile(String path) throws IOException {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        FileInputStream fstream = new FileInputStream(path);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;
        while ((strLine = br.readLine()) != null)   {
            int fileNumber = 0;
            try{
                fileNumber = Integer.parseInt(strLine);
                numbers.add(fileNumber);
            }catch (Exception e){}
        }
        br.close();
        return numbers;
    }

    private static int[] convertArrayListIntegerToArray(ArrayList<Integer> arrayList){
        int[] myArray = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            myArray[i] = Integer.valueOf(arrayList.get(i));
        }
        return myArray;
    }
}
