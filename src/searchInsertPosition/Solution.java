package searchInsertPosition;

class Solution {

  public int searchInsert(int[] nums, int target) {
    int leftIndex = 0;
    int rightIndex = nums.length - 1;
    int middleIndex;
    if (target < nums[leftIndex]) {
      return 0;
    }
    if (target > nums[rightIndex]) {
      return rightIndex + 1;
    }

    while (leftIndex <= rightIndex) {
      middleIndex = leftIndex + (rightIndex - leftIndex) / 2;
      if (target == nums[middleIndex]) {
        return middleIndex;
      }
      if (target > nums[middleIndex]) {
        leftIndex = middleIndex+1;
      }
      if (target < nums[middleIndex]) {
        rightIndex = middleIndex-1;
      }
    }

    if (target > nums[rightIndex]) {
      return rightIndex + 1;
    }
    if (target < nums[leftIndex]) {
      return leftIndex - 1;
    }
    if (target > nums[leftIndex] && target < nums[rightIndex]) {
      return leftIndex + 1;
    }

    return 0;
  }

}
