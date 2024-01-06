package climbingStairs;

public class Solution {
  public int climbStairs(int n) {
    if (n == 1) return 1;
    if (n == 2) return 2;
    int first = 1;
    int second = 2;
    int sum = 0;
    while ((n-2)>0) {
      sum = first+second;
      first = second;
      second = sum;
      n--;
    }
    return sum;
  }
}
