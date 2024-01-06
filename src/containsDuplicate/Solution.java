package containsDuplicate;

import java.util.Arrays;

public class Solution {
  public boolean containsDuplicate(int[] nums) {
    return nums.length == Arrays.stream(nums).distinct().count();
  }

}
