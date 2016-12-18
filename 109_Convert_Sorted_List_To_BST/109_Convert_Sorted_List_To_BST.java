/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ListNode cur = head;
        while(cur!=null){
            arr.add(cur.val);
            cur = cur.next;
        }
        TreeNode root = generate(arr, 0, arr.size()-1);
        return root;
    }
    
    private TreeNode generate(ArrayList<Integer> arr, int start, int end){
        if(start>end) return null;
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(arr.get(mid));
        root.left = generate(arr, start, mid-1);
        root.right = generate(arr, mid+1, end);
        return root;
    }
}
