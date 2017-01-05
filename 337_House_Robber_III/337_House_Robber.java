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
    public int rob(TreeNode root) {
        if(root == null) return 0;
        int robRoot = root.val;
        if(root.left!=null){
            robRoot += rob(root.left.left);
            robRoot += rob(root.left.right);
        }
        
        if(root.right!=null){
            robRoot += rob(root.right.left);
            robRoot += rob(root.right.right);
        }
        
        int notRobRoot = rob(root.left)+rob(root.right);
        return Math.max(robRoot, notRobRoot);
    }
}
