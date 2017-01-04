/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if(head == null || head.next == null) return;
        while(fast.next != null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //ListNode p1 = slow;
        ListNode tail = slow.next;
        while(tail.next != null){
            ListNode temp = tail.next;
            tail.next = tail.next.next;
            temp.next = slow.next;
            slow.next = temp;
        }
        
        ListNode cur = head;
        while(slow.next != null && cur != null){
           ListNode temp = slow.next;
           slow.next = slow.next.next;
           temp.next = cur.next;
           cur.next = temp;
           cur = cur.next.next;
        }
       
    }
}
