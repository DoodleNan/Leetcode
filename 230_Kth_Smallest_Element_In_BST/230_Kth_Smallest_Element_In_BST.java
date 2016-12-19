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
    public int kthSmallest(TreeNode root, int k) {
         ArrayList<Integer> arr = new ArrayList<Integer>();
         compute(arr,root,k);
         return arr.get(k-1);
    }
    
    private void compute(ArrayList<Integer> arr, TreeNode root, int k){
        if(root == null) return;
        compute(arr, root.left,k);
        arr.add(root.val);
        if(arr.size() == k) return;
        compute(arr, root.right,k);
    }
}
