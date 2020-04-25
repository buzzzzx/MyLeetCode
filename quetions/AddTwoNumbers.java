package quetions;


public class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;
        public ListNode(int x) { val = x; }
    }

    public ListNode solution(ListNode L1, ListNode L2) {

        ListNode L;
        L = helper(L1, L2, 0);

        return L;
    }

    private ListNode helper(ListNode L1, ListNode L2, int carry) {
        if (L1 == null && L2 == null) {
            if (carry == 0) {
                return null;
            } else {
                return new ListNode(carry);
            }
        }

        int v1, v2, v;
        ListNode L;

        v1 = (L1 == null) ? 0 : L1.val;
        v2 = (L2 == null) ? 0 : L2.val;
        v = v1 + v2 + carry;
        carry = 0;
        if (v >= 10) {
            v = v - 10;
            carry = 1;
        }
        L = new ListNode(v);

        L1 = (L1 == null) ? null : L1.next;
        L2 = (L2 == null) ? null : L2.next;
        L.next = helper(L1, L2, carry);

        return L;
    }

    private void test1() {
        ListNode L1 = new ListNode(2);
        L1.next = new ListNode(4);
        L1.next.next = new ListNode(5);
        ListNode L2 = new ListNode(5);
        L2.next = new ListNode(6);
        L2.next.next = new ListNode(5);
        L2.next.next.next = new ListNode(8);

        ListNode actual = solution(L1, L2);
    }

    public static void main(String[] args) {
        AddTwoNumbers adn = new AddTwoNumbers();
        adn.test1();
    }
}
