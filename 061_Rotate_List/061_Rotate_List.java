/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        ListNode current = head;
        int len = 1;
        while(current.next != null){
            current = current.next;
            len++;
        }
        current.next = head;
        k = k%len;
        if(k == 0) k = len;
        ListNode result = new ListNode(0);
        current = head;
        for(int i = 0; i<len-k;i++){
            current = current.next;
        }
        ListNode l = result;
        for(int i = 0; i<len; i++){
            l.next = new ListNode(current.val);
            l = l.next;
            current = current.next;
            if(i == len-1){
                l.next = null;
            }
        }
        return result.next;
    }
}
