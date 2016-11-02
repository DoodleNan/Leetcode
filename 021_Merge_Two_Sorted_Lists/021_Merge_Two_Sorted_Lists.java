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
        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }else{
            ListNode current1 = l1;
            ListNode current2 = l2;
            ListNode result = new ListNode(l1.val<l2.val?l1.val:l2.val);
            if(l1.val == result.val)
                current1 = l1.next;
            else
                current2 = l2.next;
            ListNode current3 = result;
            ListNode temp;
            while(current1 != null && current2 != null){
                int min = current1.val<current2.val?current1.val:current2.val;
                temp = new ListNode(min);
                if(min == current1.val)
                    current1 = current1.next;
                else
                    current2 = current2.next;
                current3.next = temp;
                current3 = temp;
            }
            
            if(current1 == null){
                current3.next = current2;
            }else{
                current3.next = current1;
            }
            return result;
        }
        
    }
}
