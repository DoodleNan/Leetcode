/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode root = new ListNode(0);
        root.next = head;
        ListNode current = head;
        ListNode pre = root;
        while(current!=null){
            if(current.val == val){
                pre.next = current.next;
                current = pre.next;
            }else{
                pre = current;
                current = current.next;
            }
            
        }
        return root.next;
    }
}
