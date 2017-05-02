/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviereview;

/**
 *
 * @author Prptri
 */
public class HashTable {
    private WordEntry[] Word;
    private int size;
    public HashTable(int size) {
        this.size = size;
        Word = new WordEntry[size];
    }

    public int computeHash(String reviewText) {
        int x = 2;
        reviewText = reviewText.toLowerCase();
        for (int temp = 0; temp < reviewText.length(); temp++) {
            x = (x * 2) + reviewText.charAt(temp);
            x = x % size;
        }
        return x;
    }

    public void put(String reviewText, double score) {
        if (contains(reviewText)) {
            Word[computeHash(reviewText)].addNewAppearance(score);
        } else {
            Word[computeHash(reviewText)] = new WordEntry(reviewText, score);
        }
    }
    
    public double getAverage(String reviewText) {
        double x = 2;
        if (contains(reviewText)) {
            x = Word[computeHash(reviewText)].getAverage();
        }
        return x;
    }

    public boolean contains(String reviewText) {
        boolean x = false;
        if (Word[computeHash(reviewText)] != null) {
            x = true;
        }
        return x;
    }
}
