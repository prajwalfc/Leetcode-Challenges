package linkedList;

public class ListNode {
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
