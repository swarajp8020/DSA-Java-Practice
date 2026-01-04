package Practice.Week9Practice;

import java.util.PriorityQueue;
//
//class Solution4 {
//    public ListNode mergeKLists(ListNode[] lists){
//        PriorityQueue<ListNode> pq = new PriorityQueue<>(
//                (a,b) -> a.val - b.val
//        );
//        for (ListNode node:lists){
//            if (node != null) {
//                pq.offer(node);
//            }
//        }
//        ListNode dummy = new ListNode(0);
//        ListNode curr = dummy;
//        while (!pq.isEmpty()) {
//            ListNode node = pq.poll();
//            curr.next = node;
//            curr = curr.next;
//            if (node.next != null) {
//                pq.offer(node.next);
//            }
//        }
//        return dummy.next;
//    }
//}
class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2(int val){
        this.val = val;
        this.next = null;
    }
}
class Solution4{
    public ListNode2 reverseList(ListNode2 head){
        ListNode2 prev = null;
        ListNode2 curr = head;
        while (curr != null) {
            ListNode2 next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
public class Jan04Morning {
    static void main(String[] args) {
        ListNode2 head = new ListNode2(1);
        head.next = new ListNode2(2);
        head.next.next = new ListNode2(3);
        head.next.next.next = new ListNode2(4);
        head.next.next.next.next = new ListNode2(5);
        Solution4 sol = new Solution4();
        ListNode2 newHead = sol.reverseList(head);
        // Print reversed list
        printList(newHead);
    }
    static void printList(ListNode2 head){
        while (head != null){
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("null");
    }
//    public static void main(String[] args) {
//        ListNode l1 = new ListNode(1);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(5);
//        ListNode l2 = new ListNode(1);
//        l2.next = new ListNode(3);
//        l2.next.next = new ListNode(4);
//        ListNode l3 = new ListNode(2);
//        l3.next = new ListNode(6);
//        ListNode[] lists = {l1, l2, l3};
//        Solution4 sol = new Solution4();
//        ListNode merged = sol.mergeKLists(lists);
//        printList(merged); // Expected: 1 → 1 → 2 → 3 → 4 → 4 → 5 → 6
//    }
//    static void printList(ListNode head) {
//        while (head != null) {
//            System.out.print(head.val + " → ");
//            head = head.next;
//        }
//        System.out.println("null");
//    }
}
