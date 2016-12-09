/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(0);
        ListNode currentL = left;
        ListNode right = new ListNode(0);
        ListNode currentR = right;
        ListNode current = head;
        while(current!=null){
            if(current.val<x){
                currentL.next = new ListNode(current.val);
                currentL = currentL.next;
            }else{
                currentR.next = new ListNode(current.val);
                currentR = currentR.next;
            }
            current = current.next;
        }
        currentL.next = right.next;
        return left.next;
    }
}
