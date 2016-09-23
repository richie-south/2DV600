package rs222kn_FoST2.tasks_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by richardsoderman on 2016-09-23.
 */
public class WordCount2Main {
  public static void main(String[] args) throws IOException {
    HashWordSet hashWordSet = new HashWordSet();
    TreeWordSet treeWordSet = new TreeWordSet();

    // reads ffile
    try(BufferedReader br = new BufferedReader(new FileReader("src/rs222kn_FoST2/tasks_5/words.txt"))) {
      for(String line; (line = br.readLine()) != null; ) {
        String[] words = line.split(" ");
        for (int i = 0; i < words.length; i++) {
          // makes new word object of word
          Word w = new Word(words[i]);
          // adds to diffrent sets
          hashWordSet.add(w);
          treeWordSet.add(w);
        }
      }
    }

    System.out.println("hashWordSet Size: " + hashWordSet.size());
    System.out.println("treeWordSet Size: " + treeWordSet.size());

    Iterator treeIterator = treeWordSet.iterator();
    while (treeIterator.hasNext()) {
      System.out.println(treeIterator.next());
    }

    Iterator hashIterator = hashWordSet.iterator();
    while (hashIterator.hasNext()) {
      System.out.println(hashIterator.next());
    }
  }
}
