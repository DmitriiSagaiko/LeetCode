package twoSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Solution1 {

  public int[] twoSum(int[] nums, int target) {
    int i = 0;
    for (; i < nums.length; i++) {
      int j = i + 1;
      for (; j < nums.length; j++) {
        if ((nums[i] + nums[j]) == target) {
          return new int[]{i, j};
        }
      }
    }
    return new int[0];
  }
}

