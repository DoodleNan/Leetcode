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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;
        if(root.val > key) root.left = deleteNode(root.left, key);
        else if(root.val < key) root.right = deleteNode(root.right, key);
        else{
            if(root.left != null && root.right != null){
                TreeNode current = root.right;
                while(current.left != null){
                    current = current.left;
                }
                root.val = current.val;
                root.right = deleteNode(root.right, root.val);
            }
            else{
                root = root.left == null?root.right:root.left;
            }
        }
        return root;
    }
}
