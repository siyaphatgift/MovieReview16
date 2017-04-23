public class WordEntry {
    private String word;
    private int numAppearance;
    private int score;
    
    public WordEntry(String text, int numAppearance ,int score){
        this.word = text;
        this.numAppearance = numAppearance;
        this.score = score;
    }
    public void addnumAppearance(int s){
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
