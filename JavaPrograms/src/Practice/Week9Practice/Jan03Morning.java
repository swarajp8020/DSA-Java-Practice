package Practice.Week9Practice;
/// Linkedlistcycle

class Solution2 {
    public boolean hasCycle(ListNode head){
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
public class Jan03Morning {
    static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        Solution2 sol = new Solution2();
        boolean hasCycle = sol.hasCycle(head);
        System.out.println("Has Cycle: " + hasCycle);
    }
}
