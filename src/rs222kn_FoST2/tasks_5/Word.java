package rs222kn_FoST2.tasks_5;

public class Word implements Comparable<Word> {

  /**
   * Simple check to see if it all works*/
  public static void main(String[] args) {
    Word w1 = new Word("Hello");
    System.out.println(w1.toString());
    Word w2 = new Word("hELLO");
    System.out.println(w2.toString());


    System.out.println("hashCode: " + w1.hashCode());
    System.out.println("hashCode: " + w2.hashCode());
    System.out.println("compareTo: " + w1.compareTo(w2));
    System.out.println("compareTo: " + w2.compareTo(w1));
    System.out.println("equals: " + w1.equals("hello"));
    System.out.println("equals: " + w2.equals("hello"));
  }

  private String word;

  public Word(String str) {
    word = str;
  }

  @Override
  public String toString() {
    return word;
  }

  @Override
  /**
   * Gets numeric value of every char in words and adds them together*/
  public int hashCode() {
    // own implementation..
    int code = 0;
    String _word = word.toLowerCase();
    for (int i = 0; i < _word.length(); i++) {
      code += Character.getNumericValue(_word.charAt(i));
    }
    return code;
    //return word.hashCode();
  }

  @Override
  public boolean equals(Object other) {
    if(other instanceof  Word){
      return word.toLowerCase().equals(other.toString().toLowerCase());
    }
    return false;
  }

  @Override
  /**
   * ingores case to se if words are the same*/
  public int compareTo(Word w) {
    return word.compareToIgnoreCase(w.toString());
  }

}