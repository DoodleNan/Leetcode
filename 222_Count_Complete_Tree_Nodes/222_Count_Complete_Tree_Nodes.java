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
    public int countNodes(TreeNode root) {
        int left = leftDepth(root);
        int right = rightDepth(root);
        if(left == right) return (1<<left)-1;
        else return 1+countNodes(root.left)+countNodes(root.right);
    }
    
    private int leftDepth(TreeNode root){
        int depth = 0;
        TreeNode current = root;
        while(current!=null){
            current = current.left;
            depth++;
        }
        return depth;
    }
    
    private int rightDepth(TreeNode root){
        int depth = 0;
        TreeNode current = root;
        while(current!=null){
            current = current.right;
            depth++;
        }
        return depth;
    }
}
