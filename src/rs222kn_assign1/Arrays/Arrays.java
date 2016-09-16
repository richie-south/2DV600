package rs222kn_assign1.Arrays;

import java.io.IOException;
import java.util.stream.IntStream;

/**
 * Created by richardsoderman on 2016-09-05.
 */
public class Arrays {
  public static void main(String[] args) throws IOException {
  }

  static int[] absDif(int[] arr1, int[] arr2) {
    if (arr1.length != arr2.length) {
      throw new IllegalArgumentException();
    }
    int result[] = new int[arr1.length];
    for (int i = 0; i < arr1.length; i++) {
      result[i] = arr1[i] - arr2[i];
    }
    return result;
  }

  static boolean hasSubsequence(int[] arr, int[] sub) {
    int nrOfMatches = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == sub[0]) {
        for (int k = 0; k < sub.length; k++) {
          if (sub[k] == arr[k + i]) {
            nrOfMatches += 1;
            if (nrOfMatches == sub.length) {
              return true;
            }
          } else {
            nrOfMatches = 0;
            break;
          }
        }
      }
    }
    return false;
  }

  static int[] sort(int[] arr) {
    return IntStream.of(arr).sorted().toArray();
  }

  static void replaceAll(int[] arr, int old, int nw) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == old) {
        arr[i] = nw;
      }
    }
  }

  static int[] reverse(int[] arr) {
    int result[] = new int[arr.length];
    int k = 0;
    for (int i = arr.length - 1; i > -1; i--) {
      result[k] = arr[i];
      k++;
    }
    return result;
  }

  static int[] addN(int[] arr, int n) {
    return IntStream.of(arr).map(i -> i + n).toArray();
  }

  static int sum(int[] arr) {
    return IntStream.of(arr).reduce(0, (a, b) -> a + b);
  }

  static String toString(int[] arr) {
    String result = "{ ";
    for (int i = 0; i < arr.length; i++) {
      result += arr[i] + (i + 1 == arr.length ? " " : ", ");
    }
    return result += "}";
  }
}
