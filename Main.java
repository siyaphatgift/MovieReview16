import java.io.IOException;
import java.io.File;
import java.util.Scanner;
public class Main {
  public static void main(String args[]) throws IOException {
    File reviewFile = new File("movieReviews.txt");
    Scanner keyboard = new Scanner(System.in);
    int reviewScore;
    String reviewText;
    String review;
    double key = 0;
    HashTable table = new HashTable(20000);
    System.out.println("Enter a review:");
    review = keyboard.nextLine();
    String[] arr = review.split(" ");
    for (String word : arr) {
      Scanner reviewScanner = new Scanner(reviewFile);
      word = (" " + word + " ").toLowerCase();
      while (reviewScanner.hasNext()) {
        reviewScore = reviewScanner.nextInt();
        reviewText = reviewScanner.nextLine().toLowerCase();
        if (reviewText.contains(word)) {
          table.put(reviewText, reviewScore);
          key = table.getAverage(reviewText);
        }
      }
    }
    System.out.println("The review has an average value of " + key );
    if (key < 2) {
      System.out.println("Negative Sentiment");
    } else {
      System.out.println("Positive Sentiment");
    }
  }
}