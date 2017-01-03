/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> s1 = new Stack<ListNode>();
        Stack<ListNode> s2 = new Stack<ListNode>();
        while(l1 != null){
            s1.push(l1);
            l1 = l1.next;
        }
        
        while(l2 != null){
            s2.push(l2);
            l2 = l2.next;
        }
        
        int sum = 0;
        ListNode head = new ListNode(0);
        while(!s1.isEmpty() || !s2.isEmpty() || sum != 0){
            if(!s1.isEmpty()) sum+=s1.pop().val;
            if(!s2.isEmpty()) sum+=s2.pop().val;
            ListNode node = new ListNode(sum%10);
            node.next = head.next;
            head.next = node;
            sum /= 10;
        }
        return head.next;
    }
}
