package searchInsertPosition;

import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] ints = new int[]{5,2,7,0};
   // int[] ints = new int[]{4};
    int[] input = new int[]{1,3,5,6};
   // int[] input = new int[]{1,3,5};

    for (int anInt : ints) {
      System.out.println(solution.searchInsert(input, anInt));
      System.out.println();
    }

  }

}
