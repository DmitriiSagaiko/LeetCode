package plusOne;

public class Solution {

  public int[] plusOne(int[] digits) {
    if (digits[digits.length - 1] == 9) {
      digits[digits.length - 1] = 0;
      for (int i = digits.length - 2; i >= 0; i--) {
        if (digits[i] == 9) {
          digits[i] = 0;
        } else {
          digits[i] += 1;
          break;
        }
      }
    } else {
      digits[digits.length - 1] += 1;
      return digits;
    }

    int[] result;
    if (digits[0] == 0) {
      result = new int[digits.length + 1];
      result[0] = 1;
      for (int i = 1; i < result.length; i++) {
        result[i] = 0;
      }
      return result;
    } else {
      return digits;
    }
  }

}
