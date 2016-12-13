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
        int result = 0;
        if(root == null) return 0;
        else{
            if(root.left != null){
                if(root.left.left == null && root.left.right == null) result += root.left.val;
                else{
                    result += sumOfLeftLeaves(root.left);
                }
            }
            result += sumOfLeftLeaves(root.right);
        }
        return result;
    }
}
