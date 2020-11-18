package linkedList;

import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @Test
    public void twoSumTest(){
        TwoSum.ListNode l1 = new TwoSum.ListNode(2);
        l1.next= new TwoSum.ListNode(4);
        l1.next.next = new TwoSum.ListNode(3);

        TwoSum.ListNode l2 = new TwoSum.ListNode(5);
        l2.next= new TwoSum.ListNode(6);
        l2.next.next = new TwoSum.ListNode(4);

        System.out.println(new TwoSum().addTwoNumbers(l1,l2));
    }

}