/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        ListNode node = cur;
        if(node == null) return head;
        while(cur!=null){
            while(node.next != null && node.val == node.next.val){
                node = node.next;
            }
            cur.next = node.next;
            cur = node.next;
            node = cur;
        }
       return head; 
    }
}
