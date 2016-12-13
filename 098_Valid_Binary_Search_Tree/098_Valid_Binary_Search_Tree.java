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
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        if(!isValidBST(root.left) || !isValidBST(root.right)) return false;
        TreeNode current = root.left;
        boolean leftValid = false;
        if(current == null) leftValid = true; 
        else {
            while(current.right != null){
                current = current.right;
            }
            leftValid = current.val < root.val? true: false;
        }   
        
        boolean rightValid = false;
        current = root.right;
        if(current == null) rightValid = true;
        else{
            while(current.left != null){
                current = current.left;
            }
            rightValid = current.val > root.val?true : false;
        }
        return leftValid && rightValid;
    }
}
