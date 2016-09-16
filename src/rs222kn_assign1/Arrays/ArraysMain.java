package rs222kn_assign1.Arrays;

import java.io.IOException;

/**
 * Created by richardsoderman on 2016-09-05.
 */
public class ArraysMain {

    public static void main(String[] args) throws IOException {


        int[] sum = {1, 2, 3};
        int[] addN = {1, 1, 1};
        int[] reverse = {2, 5, 7, 1};
        int[] replaceAll = {1, 5, 5, 1};
        int[] sort = {5, 3, 1, 4, 2};
        int[] hasSubsequence1 =  {1, 2, 3, 4, 5};
        int[] hasSubsequence2 = {2, 3, 4};
        int[] absDif1 =  {1, 2, 3, 4, 5};
        int[] absDif2 = {1, 1, 1, 1, 1};

        System.out.println("SUM");
        System.out.println(Arrays.sum(sum));
        System.out.println("");
        System.out.println("toString");
        System.out.println(Arrays.toString(sum));
        System.out.println("");
        System.out.println("addN");
        System.out.println(Arrays.toString(Arrays.addN(addN, 2)));
        System.out.println("");
        System.out.println("reverse");
        System.out.println(Arrays.toString(Arrays.reverse(reverse)));
        System.out.println("");
        System.out.println("replaceAll");
        System.out.println("origin array: " + Arrays.toString(replaceAll));
        Arrays.replaceAll(replaceAll, 5, 1);
        System.out.println("after array: " + Arrays.toString(replaceAll));
        System.out.println("");
        System.out.println("sort");
        System.out.println(Arrays.toString(Arrays.sort(sort)));
        System.out.println("");
        System.out.println("hasSubsequence");
        System.out.println(Arrays.hasSubsequence(hasSubsequence1, hasSubsequence2));
        System.out.println("");
        System.out.println("absDif");
        System.out.println(Arrays.toString(Arrays.absDif(absDif1, absDif2)));

    }
}
