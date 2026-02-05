package LeetCodePrograms;

import java.util.ArrayList;

/**
 * The LeetCodePrograms.BestTimeToSell class provides a solution to find the maximum profit
 * that can be achieved by buying and selling a stock on different days.
 * It calculates all possible profits and identifies the maximum profit
 * along with the corresponding buy and sell days.
 */
public class BestTimeToSell {

  /**
   * The main method is the entry point of the program.
   * It calculates the maximum profit from an array of stock prices
   * and prints the details of all possible transactions and the best transaction.
   *
   * @param args Command-line arguments (not used in this program).
   */
  public static void main(String[] args) {
    // Array of stock prices where each element represents the price on a specific day.
    int[] prices = {7, 1, 5, 3, 6, 4};

    // Variable to store the profit for each transaction.
    int sum = 0;

    // List to store all possible transactions as arrays of {buyDay, sellDay, profit}.
    ArrayList<int[]> arrayList = new ArrayList<>();

    // Nested loop to calculate all possible profits from buying and selling on different days.
    for (int i = 0; i < prices.length; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        sum = prices[j] - prices[i]; // Calculate profit for the current transaction.
        if (sum >= 0) { // Only consider transactions with non-negative profit.
          arrayList.add(new int[]{i, j, sum}); // Add the transaction to the list.
        }
      }
    }

    // Variables to track the maximum profit and the corresponding buy and sell days.
    int maxprofit = 0;
    int buyDay = -1;
    int sellDay = -1;

    // Iterate through the list of transactions to find the maximum profit.
    for (int[] entry : arrayList) {
      // Print details of the current transaction.
      System.out.println("Buy on day " + entry[0] + ", sell on day " + entry[1] + ", profit: " + entry[2]);
      if (entry[2] > maxprofit) { // Update maxprofit if the current profit is greater.
        maxprofit = entry[2];
        buyDay = entry[0];
        sellDay = entry[1];
      }
    }

    // Print the maximum profit and the corresponding buy and sell days (1-based indexing).
    System.out.println("Maximum profit: " + maxprofit + " (Buy on day " + (buyDay + 1) + ", sell on day " + (sellDay + 1) + ")");
  }
}