/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        ListNode current = head;
        while(current != null){
            array.add(current.val);
            current = current.next;
        }
        int i = 0;
        int j = array.size()-1;
        while(i<=j){
            if(!array.get(i).equals(array.get(j)))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
