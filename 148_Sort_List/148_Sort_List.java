/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode end = head;
        while(fast != null && fast.next != null){
            end = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        
        end.next = null;
        head = sortList(head);
        slow = sortList(slow);
        return merge(head, slow);
    }
    
    private ListNode merge(ListNode l1, ListNode l2){
        ListNode result = new ListNode(0);
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode cur = result;
        while(p1 != null && p2 != null){
            if(p1.val>p2.val){
                cur.next = p2; 
                p2 = p2.next;
            }else{
                cur.next = p1;
                p1 = p1.next;
            }
            cur = cur.next;
        }
        if(p1 == null) cur.next = p2;
        if(p2 == null) cur.next = p1;
        return result.next;
    }
}
