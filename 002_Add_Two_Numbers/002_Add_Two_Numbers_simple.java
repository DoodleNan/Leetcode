/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode result = new ListNode(0);
        ListNode p3 = result;
        
        int carry = 0;
        while(p1 != null || p2 != null || carry > 0){
            carry += p1 == null?0:p1.val;
            carry += p2 == null?0:p2.val;
            if(p1!=null) p1 = p1.next;
            if(p2!=null) p2 = p2.next;
            p3.next = new ListNode(carry%10);
            p3 = p3.next;
            carry /= 10;
        }
        return result.next;
    }
}
