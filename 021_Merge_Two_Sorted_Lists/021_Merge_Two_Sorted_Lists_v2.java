/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode cur = result;
        while(cur1 != null && cur2 != null){
            if(cur1.val<cur2.val){
                cur.next = cur1;
                cur1 = cur1.next;
            }else{
                cur.next = cur2;
                cur2 = cur2.next;
            }
            cur = cur.next;
        }
        if(cur1 == null){
            cur.next = cur2;
        }
        if(cur2 == null){
            cur.next = cur1;
        }
        return result.next;
    }
}
