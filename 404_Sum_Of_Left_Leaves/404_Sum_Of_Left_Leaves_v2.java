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
    public int sumOfLeftLeaves(TreeNode root) {
         return dfs(root, false);
    }
    
    private int dfs(TreeNode root, boolean isLeft){
        if(root == null) return 0;
        if(root.left == null && root.right == null){
            if(isLeft) return root.val;
            else return 0;
        }
        return dfs(root.left, true) + dfs(root.right, false);
    }
}
