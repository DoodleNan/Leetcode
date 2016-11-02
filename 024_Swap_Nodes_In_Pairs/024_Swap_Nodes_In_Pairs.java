/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode current = head;
        if(head == null){
            return head;
        }
        ListNode next = current.next;
        ListNode temp;
        while(current!=null){
            if(next == null){
                return dummy.next;
            }else{
                temp = next;
                current.next = next.next;
                temp.next = current;
                pre.next = temp;
                next = temp;
                pre = pre.next.next;
                current = current.next;
                if(current == null){
                    return dummy.next;
                }
                next = current.next;
            }
        }
        return dummy.next;
    }
}
