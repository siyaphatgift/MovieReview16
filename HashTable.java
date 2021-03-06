import java.util.*;

public class HashTable {
  List<WordEntry> wordEntryList = new ArrayList();

  public int computeHash(String s) {
    int x = 1;
    for (WordEntry a: wordEntryList) {
      if(a.getWord().equals(s)) {
        x++;
      }
    }
      return x;
  }
  
  public void put(String s, int score) {
    if(contains(s)) {
      getWordEntry(s).addNewAppearance(score);
    }else {
      WordEntry a = new WordEntry(s, score);
      wordEntryList.add(a);
    }
  }
  
  public WordEntry getWordEntry(String s) {
    WordEntry a = null;
    for(WordEntry word: wordEntryList) {
      if(word.getWord().equals(s)) {
        a = word;
      }
    }
    return a;
  }
  
  public double getAverage(String s) {
    double x = 2.0D;
    if(contains(s)) {
      getWordEntry(s).getAverage();
    }
    return x;
  }
  
  public boolean contains(String s) {
    boolean x = false;
    for(WordEntry a: wordEntryList) {
      if (a.getWord().equals(s)){
        x = true;
      }
    }
    return x;
  }
  
}