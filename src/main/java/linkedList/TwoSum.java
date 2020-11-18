package linkedList;

public class TwoSum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode sumList = new ListNode(0);
        ListNode head = sumList;
        int carry = 0;
        addTwoNumbersHelper(l1, l2, carry, head);
        return sumList.next;
    }

    private void addTwoNumbersHelper(ListNode l1, ListNode l2, int carry, ListNode head) {
        if (carry == 0 && l1 == null && l2 == null) return;
        int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
        head.next = new ListNode(sum % 10);
        carry = sum / 10;
        addTwoNumbersHelper(l1 == null ? null : l1.next, l2 == null ? null : l2.next, carry, head.next);
    }

    public static class ListNode {
        int val;
        public ListNode next;

        ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return (val + (next == null ? "" : " - " + next.toString()));
        }
    }
}
