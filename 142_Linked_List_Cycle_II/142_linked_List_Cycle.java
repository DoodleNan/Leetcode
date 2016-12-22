/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        //boolean hasCycle;
        ListNode fast = head;
        ListNode slow = head;
        while(slow!=null && fast!=null){
            slow = slow.next;
            if(fast.next == null) return null;
            else{
                fast = fast.next.next;
            }
            if(slow == fast) break;
        }
        if(fast == null) return null;
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
