package quetions;

public class RemoveNthNodeFromEndOfList {
    private class ListNode {
        int val;
        ListNode next;
        public ListNode() {}
        public ListNode(int val) {
            this.val = val;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode solution1(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        int size = 0;
        ListNode p = head;
        while (p != null) {
            size += 1;
            p = p.next;
        }

        if (size == n) {
            return head.next;
        }

        p = head;
        for (int i = 1; i < size - n; i += 1) {
            p = p.next;
        }
        p.next = p.next.next;
        return head;
    }

    public ListNode solution2(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode slow = dummyHead;
        ListNode fast = dummyHead;
        for (int i = 0; i <= n; i += 1) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummyHead.next;
    }
}
