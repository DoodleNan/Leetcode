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
        
        boolean carry = false;
        while(p1 != null || p2 != null){
            p3.next = new ListNode(0);
            p3 = p3.next;
            if(p1 != null){
                p3.val += p1.val;
                p1 = p1.next;
            }
            if(p2 != null){
                p3.val += p2.val;
                p2 = p2.next;
            }
            if(carry){
                p3.val += 1;
            }
            if(p3.val > 9){
                p3.val -= 10;
                carry = true;
            }
            else
                carry = false;
        }
        if(carry){
            p3.next = new ListNode(1);
        }
        return result.next;
    }
}
