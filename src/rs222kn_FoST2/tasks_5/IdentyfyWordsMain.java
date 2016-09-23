package rs222kn_FoST2.tasks_5;

import java.io.*;

public class IdentyfyWordsMain  {
  public static void main(String[] args) throws IOException {
    String str = "";
    try(BufferedReader br = new BufferedReader(new FileReader("src/rs222kn_FoST2/tasks_5/HistoryOfProgramming.txt"))) {
      for(String line; (line = br.readLine()) != null; ) {
        str += line.replaceAll("[-]", " ") // remove all -
            .replaceAll("\\w*\\d\\w*", "").trim() // removes all letters after or before number ex 1990s
            .replaceAll("[^a-zA-Z\\s]", "") + "\n"; // replaces unwanted caracters;
      }
    }
    SaveToFile(
        CreateNewFile("src/rs222kn_FoST2/tasks_5/words.txt"),
        str);
  }

  /**
   * Creates new file*/
  public static File CreateNewFile(String fileName) throws IOException {
    File file = new File(fileName);
    file.createNewFile();
    return file;
  }

  /**
   * Saves content to file*/
  public static void SaveToFile(File file, String content) throws IOException {
    FileWriter fw = new FileWriter(file.getAbsoluteFile(), false);
    BufferedWriter  bw = new BufferedWriter(fw);
    bw.append(content);
    bw.close();
  }

}
