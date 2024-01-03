package twoSum;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
  public int[] twoSum(int[] nums, int target) {
    if(nums.length==2) {
      if (nums[0]+nums[1] == target) {
        return new int[]{0,1};
      }
    }
    Set<Integer> integers = new LinkedHashSet<>();
    for(Integer i : nums) {
      integers.add(i);
    }

    Integer[] array = integers.stream().filter(integer -> integer < target)
        .toArray(Integer[]::new);
    System.out.println(Arrays.toString(array) + " arr");
    int leftIndex = 0;
    int rightIndex = array.length-1;
    while (leftIndex<=rightIndex) {
      int diffLeft = target-array[leftIndex];
      int diffRight = target-array[rightIndex];
      if ((array[leftIndex] + array[rightIndex]) == target) {
        return new int[] {leftIndex,rightIndex};
      }
      if (diffLeft>diffRight) {
        leftIndex++;
      } else {
        rightIndex--;
      }

    }
    return new int[]{0,1};
  }
}
