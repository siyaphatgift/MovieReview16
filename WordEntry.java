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
public class WordEntry{
        String word;
        int numAppearance = 0;
        int score = 0;
        int totalScore = 0;

        public WordEntry(String text, double s) {
            word = text;
            totalScore += s;
            numAppearance = 1;
        }

        public void addNewAppearance(double s) {
            totalScore += s;
            numAppearance++;
        }

        public String getWord() {
            return word;
        }

        public double getAverage() {
            return (double) totalScore / numAppearance;
        }
    }


