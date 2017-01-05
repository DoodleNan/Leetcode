/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode helper = new ListNode(0);
        ListNode pre = helper;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            while(pre.next != null && pre.next.val < cur.val) pre = pre.next;
            cur.next = pre.next;
            pre.next = cur;
            cur = next;
            pre = helper;
        }
        return helper.next;
    }
}
