import java.util.*;

public class HashTable {
  //List<WordEntry> wordEntryList = new ArrayList();
  private WordEntry []word;
  private int size;
  
  public HashTable(int s)
  {
    this.size = s;
    word = new WordEntry[s];
  }
  
  public int computeHash(String s) {
    //String 
    int x = 1;
    for (WordEntry a: word) {
      if(a.getWord().equals(s)) {
        x++;
      }
    }
    return x;
  }
  
  /*public boolean contains(String s) {
    boolean x = false;
    for(WordEntry a: wordEntryList) {
      if (a.getWord().equals(s)){
        x = true;
      }
    }
    return x;
  }*/
  
   public double getAverage(String s) {
    double x = 2.0D;
    /*if(contains(s)) {
      getWordEntry(s).getAverage();
    }
    return x;*/
  }
  
  public WordEntry getWordEntry(String s) {
    WordEntry a = null;
    /*for(WordEntry word: wordEntryList) {
      if(word.getWord().equals(s)) {
        a = word;
      }
    }*/
    return a;
  }
 
  public void put(String s, int score) {
    /*if(contains(s)) {
      getWordEntry(s).addNewAppearance(score);
    }else {*/
      WordEntry a = new WordEntry(s, score);
      wordEntryList.add(a);
    }
  }
}