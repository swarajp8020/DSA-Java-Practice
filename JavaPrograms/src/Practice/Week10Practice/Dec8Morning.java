package Practice.Week10Practice;

import java.util.PriorityQueue;
//
//class Solution3 {
//    public ListNode mergeKLists(ListNode[] lists) {
//        PriorityQueue <ListNode> pq = new PriorityQueue<>(
//                (a,b) -> a.value - b.value
//        );
//        for (ListNode node:lists) {
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
class Solution3 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}

public class Dec8Morning {
    static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = head.next.next;
        Solution3 sol = new Solution3();
        ListNode cycleStart = sol.detectCycle(head);
        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.value);
        } else {
            System.out.println("No cycle detected");
        }
    }
//    static void main(String[] args) {
//        ListNode l1 = new ListNode(1);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(5);
//        ListNode l2 = new ListNode(1);
//        l2.next = new ListNode(3);
//        l2.next.next = new ListNode(4);
//        ListNode l3 = new ListNode(2);
//        l3.next = new ListNode(6);
//        ListNode[] lists = {l1, l2, l3};
//        Solution3 sol = new Solution3();
//        ListNode merged = sol.mergeKLists(lists);
//        printList(merged);
//    }
//    static void printList(ListNode head) {
//        while (head != null) {
//            System.out.print(head.value + " → ");
//            head = head.next;
//        }
//        System.out.println("null");
//    }
}
