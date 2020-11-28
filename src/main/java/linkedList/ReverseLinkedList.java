package linkedList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null ) return head;
        ListNode end = null;
        ListNode previous = end;
        ListNode current  = head;
        return changeDirection(current, previous,current.next);
    }
    private ListNode changeDirection(ListNode current, ListNode previous, ListNode next){
        if(current == null) return previous;
        current.next = previous;
        if(next == null) return current;
        return changeDirection(next, current, next.next);
    }
}
