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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        HashMap<TreeNode, Integer> hm = new HashMap<TreeNode, Integer>();
        int leftDepth = depth(root.left, hm);
        int rightDepth = depth(root.right, hm);
        if(Math.abs(leftDepth-rightDepth)<2 && isBalanced(root.left) && isBalanced(root.right)) return true;
        return false;
    }
    
    private int depth(TreeNode root, HashMap<TreeNode, Integer> hm){
        if(root == null) return 0;
        if(!hm.containsKey(root)){
            int dep = 1 + Math.max(depth(root.left,hm), depth(root.right, hm));
            hm.put(root, dep);
        }
        return (int)hm.get(root);
    }
}
