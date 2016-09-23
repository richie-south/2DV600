package rs222kn_FoST2.tasks_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by richardsoderman on 2016-09-21.
 */
public class WordCount1Main {

  public static void main(String[] args) throws IOException {
    HashSet<Word> hashSet = new HashSet();
    TreeSet<Word> treeSet = new TreeSet();

    // reads ffile
    try(BufferedReader br = new BufferedReader(new FileReader("src/rs222kn_FoST2/tasks_5/words.txt"))) {
      for(String line; (line = br.readLine()) != null; ) {
        String[] words = line.split(" ");
        for (int i = 0; i < words.length; i++) {
            // makes new word object of word
            Word w = new Word(words[i]);
            // adds to diffrent sets
            hashSet.add(w);
            treeSet.add(w);
        }
      }
    }

    System.out.println("hashSet Size: " + hashSet.size());
    System.out.println("treeSet Size: " + treeSet.size());

    // prints everything in TreeSet
    for(Word w : treeSet){
      System.out.println(w.toString());
    }
  }
}
