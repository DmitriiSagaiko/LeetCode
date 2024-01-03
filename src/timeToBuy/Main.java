package timeToBuy;

public class Main {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] prices = new int[]{3, 2, 6, 5, 0, 3};
    System.out.println(solution.maxProfit(prices));
  }
}
