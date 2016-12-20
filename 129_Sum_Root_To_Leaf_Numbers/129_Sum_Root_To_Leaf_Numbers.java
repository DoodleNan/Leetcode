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
    int total;
    public int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return total;
    }
    
    private void dfs(TreeNode node, int pre){
        if(node == null) return;
        else{
            if(node.left == null && node.right == null) total += pre*10+node.val;
            dfs(node.left, pre*10+node.val);
            dfs(node.right, pre*10+node.val);
        }
    }
}
