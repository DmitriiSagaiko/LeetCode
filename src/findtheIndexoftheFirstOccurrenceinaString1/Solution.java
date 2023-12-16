package findtheIndexoftheFirstOccurrenceinaString1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
  public int strStr(String haystack, String needle) {
    Pattern pattern = Pattern.compile(needle);
    Matcher matcher = pattern.matcher(haystack);
    if (matcher.find()) {
      return matcher.start();
    } else {
      return -1;
    }
  }
}
