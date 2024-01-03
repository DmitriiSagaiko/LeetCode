package sqrtX;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {

  public int mySqrt(int x) {
    int left = 0;
    int right = x;
    int[] array = new int[right + 1];
    for (int i = 0; i <= right; i++) {
      array[i] = i;
    }
    int middle;
    if (x == 1) {
      return 1;
    }
    if (x == 0) {
      return 0;
    }
    if (x == 2) {
      return 1;
    }
    while (left <= right) {
      middle = left + (right - left) / 2;
      if (array[middle] == x * x) {
        return middle;
      }
      if (array[middle] * array[middle] > x) {
        left = middle - 1;
      }
      if ( array[middle] * array[middle] < x) {
        right = middle + 1;
      }
      System.out.println(right);
      System.out.println(middle);
      System.out.println(left);
    }


    return -1;
  }
}
