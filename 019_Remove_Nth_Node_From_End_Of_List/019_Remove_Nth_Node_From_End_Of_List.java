/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        ArrayList<ListNode> arr = new ArrayList<ListNode>();
        ListNode current = head;
        while(current!=null){
            arr.add(current);
            current = current.next;
        }
        if(arr.size() == n) return head.next;
        arr.get(arr.size()-n-1).next = arr.get(arr.size()-n).next;
        return head;
    }
}
