package romanToInteger;

public class Solution {

  public int romanToInt(String s) {
    int answer = 0;
    char[] chars = s.toCharArray();
    int i = 0;
    for (; i < chars.length - 1; i++) {
      char current = chars[i];

      if (current == 'I') {
        if (chars[i + 1] == 'V') {
          answer = answer + 4;
          i++;
          continue;
        } else if (chars[i + 1] == 'X') {
          answer = answer + 9;
          i++;
          continue;
        }
        answer = answer + 1;
      }

      if (current == 'X') {
        if (chars[i + 1] == 'L') {
          answer = answer + 40;
          i++;
          continue;
        } else if (chars[i + 1] == 'C') {
          answer = answer + 90;
          i++;
          continue;
        }
        answer = answer + 10;
      }

      if (current == 'C') {
        if (chars[i + 1] == 'D') {
          answer = answer + 400;
          i++;
          continue;
        } else if (chars[i + 1] == 'M') {
          answer = answer + 900;
          i++;
          continue;
        }
        answer = answer + 100;
      }

      if (current == 'V') {
        answer = answer + 5;
      } else if (current == 'L') {
        answer = answer + 50;
      } else if (current == 'D') {
        answer = answer + 500;
      } else if (current == 'M') {
        answer = answer + 1000;
      }

    }
    if (chars.length != i) {
      answer = answer + getSimpleNumber(chars[chars.length - 1]);
    }

    return answer;
  }

  public int getSimpleNumber(char inputChar) {
    if (inputChar == 'I') {
      return 1;
    } else if (inputChar == 'V') {
      return 5;
    } else if (inputChar == 'X') {
      return 10;
    } else if (inputChar == 'L') {
      return 50;
    } else if (inputChar == 'C') {
      return 100;
    } else if (inputChar == 'D') {
      return 500;
    } else if (inputChar == 'M') {
      return 1000;
    }
    return 0;
  }

}
