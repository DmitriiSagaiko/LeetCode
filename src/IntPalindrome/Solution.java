package IntPalindrome;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Solution {

  public boolean isPalindrome(int x) {
    int temp = x;
    int result = 0;

    if (x == Integer.MAX_VALUE || x == Integer.MIN_VALUE) {
      return false;
    }

    if (x == 0) {
      return true;
    }

    if (x < 0 || x % 10 == 0) {
      return false;
    }
    ArrayList<Integer> list = new ArrayList<>();


    while (true) {
      int rest = temp % 10;
      list.add(rest);
      temp = temp / 10;
      if (temp == 0) break;
    }
    int size = list.size();
    for (int i = 0; i < list.size(); i++) {
      result = (int) (result + (list.get(i) * Math.pow(10, size - 1)));
      size--;
    }
    System.out.println(result);

    return result == x;
  }
}
