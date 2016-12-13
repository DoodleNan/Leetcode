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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode root = build(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
        return root;
    }
    
    private TreeNode build(int []in, int inStart, int inEnd, int[] post, int postStart, int postEnd){
        if(in.length == 0 || post.length == 0 || inStart > inEnd || postStart > postEnd) return null;
        TreeNode root = new TreeNode(post[postEnd]);
        for(int i = inStart; i<=inEnd; i++){
            if(in[i] == post[postEnd]){
                root.left = build(in, inStart, i-1, post, postStart, postStart+i-inStart-1);
                root.right = build(in, i+1, inEnd, post, postStart+i-inStart, postEnd-1);
                break;
            }
        }
        return root;
    }
}
