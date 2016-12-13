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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = build(preorder, 0, preorder.length-1, inorder,0, inorder.length-1);
        return root;
    }
    
    TreeNode build(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd){
        if(pre.length == 0 || in.length == 0 || preStart>preEnd || inEnd < inStart) return null;
        TreeNode root = new TreeNode(pre[preStart]);
        int i = 0;
        for(i = inStart; i<=inEnd; i++){
            if(in[i] == pre[preStart]) break;
        }
        root.left = build(pre,preStart+1, preStart+i-inStart, in, inStart, i-1);
        root.right = build(pre, preStart+i-inStart+1, preEnd, in, i+1, inEnd);
        return root;
    }
}
