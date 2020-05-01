package quetions;


public class SwapNodesInPairs {
    private static class ListNode {
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

    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode curr = dummyHead;
        while (curr.next != null && curr.next.next != null) {
            ListNode first = curr.next;
            ListNode second = curr.next.next;
            first.next = second.next;
            curr.next = second;
            curr.next.next = first;
            curr = first;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(4);
        ListNode b = new ListNode(3, a);
        ListNode c = new ListNode(2, b);
        ListNode head = new ListNode(1, c);

        SwapNodesInPairs s = new SwapNodesInPairs();
        ListNode res = s.swapPairs(head);

    }
}