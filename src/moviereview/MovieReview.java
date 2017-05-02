/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviereview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Prptri
 */
public class MovieReview {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        File SortFile = new File("movieReviews.txt");

        int reviewScore;
        String reviewText;
        String review;
        double D = 0;
        
        HashTable table = new HashTable(1000);

        System.out.println("Enter a review:");
        review = sc.nextLine();
        String[] arr = review.split(" ");

        for (String word : arr) {
            Scanner reviewScanner = new Scanner(SortFile);
            word = (" " + word + " ").toLowerCase();

            while (reviewScanner.hasNext()) {
                reviewScore = reviewScanner.nextInt();
                reviewText = reviewScanner.nextLine().toLowerCase();

                if (reviewText.contains(word)) {
                    table.put(reviewText, reviewScore);
                    D = table.getAverage(reviewText);
                }
            }
        }
        System.out.println("The review has an average value of " + D);
        if (D==0){
            System.out.println("No Words");
        }
        else if (D<2 && D!=0){
            System.out.println("Negative Sentiment");
        }
         else{
            System.out.println("Positive Sentiment");
        }
    }
}


    

