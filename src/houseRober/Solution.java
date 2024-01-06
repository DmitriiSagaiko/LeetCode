package houseRober;

public class Solution {

  public int rob(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }
    if (nums.length == 2) {
      return Math.max(nums[0], nums[1]);
    }
    int sum = 0;
    int current = 0;
    int next = current+1;

    while (current<nums.length) {
      if (next >= nums.length) {
        sum += nums[current];
        break;
      }

      if (nums[current] > nums[next]) {
        sum += nums[current];
        current +=2;
      } else {
        sum +=nums[next];
        current +=3;
      }
      next = current+1;
    }
    return sum;
  }
}
