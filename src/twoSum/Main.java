package twoSum;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
//    Solution solution = new Solution();
    int[] input = new int[]{3,2,4};
    int target = 6;
//    int[] output = solution.twoSum(input,target);
//    System.out.println(Arrays.toString(output));


    Solution1 solution1 = new Solution1();
    int[] output1 = solution1.twoSum(input,target);
    System.out.println(Arrays.toString(output1));
  }

}
