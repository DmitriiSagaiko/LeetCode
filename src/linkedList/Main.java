package linkedList;

public class Main {

  public static void main(String[] args) {
    Solution solution = new Solution();
    ListNode listNode5 = new ListNode(5,null);
    ListNode listNode4 = new ListNode(4,listNode5);
    ListNode listNode3 = new ListNode(3,listNode4);
    ListNode listNode2 = new ListNode(2,listNode3);
    ListNode listNode1 = new ListNode(1,listNode2);

    System.out.println(solution.reverseList(listNode5));
  }
}
