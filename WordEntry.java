public class WordEntry {
    private String word;
    private int numAppearance;
    private int score;
    
    public WordEntry(String text, int score){
        this.word = text;
        this.score = score;
        this.numAppearance = 1;
    }
    
    public void addNewAppearance(int s){
        score = score + s;
        numAppearance++;
    }
    
    public String getWord(){
        return word;
    }
    
    public double getAverage(){
        return (double)score/ numAppearance;
    }
}
