package Practice.Week10Practice;
//reverseLinkedList
class Solution2 {
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
public class Dec7Morning {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Solution2 sol = new Solution2();
        ListNode newHead = sol.reverseList(head);
        printList(newHead);
    }
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.value + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
