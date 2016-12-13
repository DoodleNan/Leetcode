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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        inorder(result, root);
        return result;
    }
    private void inorder(List<Integer> result, TreeNode root){
        if(root == null) return;
        inorder(result, root.left);
        result.add(root.val);
        inorder(result, root.right);
    }
}
