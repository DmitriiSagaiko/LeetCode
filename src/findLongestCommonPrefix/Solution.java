package findLongestCommonPrefix;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) {
      return "";
    }
    boolean isValid = false;
    String result = new String();
    List<String> list = Arrays.stream(strs).sorted(Comparator.comparingInt(String::length))
        .collect(Collectors.toList());
    my:
    for (int i = 0; i < strs[0].length(); i++) {
      char current = strs[0].charAt(i);
      for (String s : list) {
        if (s.length() <= i) {
          isValid = false;
          continue;
        }
        if ((current == s.charAt(i))) {
          isValid = true;
        } else {
          isValid = false;
          break my;
        }
      }
      if (isValid && list.get(0).length() > result.length()) {
        result += current;
      }
    }
    System.out.println("result= " + result);

    return result;
  }

}
