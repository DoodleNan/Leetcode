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
    private List<Integer> result = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        helper(root);
        return result;
    }
    private void helper(TreeNode root){
        if(root == null) return;
        result.add(root.val);
        helper(root.left);
        helper(root.right);
    }
}
