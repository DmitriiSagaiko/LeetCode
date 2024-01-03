package addBinary;

import java.util.Arrays;

public class Solution {

  public String addBinary(String a, String b) {
    StringBuilder stringBuilder = new StringBuilder();
    int extraLength = 0;
    String longest;
    String shortest;
    String s = "";
    if (a.length() > b.length()) {
      extraLength = a.length() - b.length();
      longest = a;
      shortest = b;
    } else {
      extraLength = b.length() - a.length();
      longest = b;
      shortest = a;
    }
    for (int i = 0; i < extraLength; i++) {
      s = s + "0";
    }
    shortest = s + shortest;
    boolean dec = false;
    for (int i = longest.length() - 1; i >= 0; i--) {
      if (longest.charAt(i) == 1 && shortest.charAt(i) == 1 && dec) {
        stringBuilder.append(1);
      } else if ((longest.charAt(i) == 1 && shortest.charAt(i) == 0 && dec) || (
          longest.charAt(i) == 0 && shortest.charAt(i) == 1 && dec) || (longest.charAt(i) == 1
          && shortest.charAt(i) == 1 && !dec)) {
        stringBuilder.append(0);
        dec = true;
      } else {
        if ((longest.charAt(i) == 0 && shortest.charAt(i) == 0) || (longest.charAt(i) == 0 && !dec) || (shortest.charAt(i) == 0 && !dec)) {

        }
      }
    }
    stringBuilder.reverse();

    return stringBuilder.toString();
  }
}
