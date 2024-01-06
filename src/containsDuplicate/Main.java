package containsDuplicate;

public class Main {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] array = new int[] {1,2,3,4};
    int[] array1 = new int[] {1,1,3,4};
    System.out.println(solution.containsDuplicate(array));
    System.out.println(solution.containsDuplicate(array1));
  }
}
