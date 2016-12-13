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
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        return dfs(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    
    private int dfs(TreeNode root, int sum){
        int result = 0;
        if(root == null) return 0;
        if(root.val == sum) result++;
        result += dfs(root.left, sum-root.val);
        result += dfs(root.right, sum-root.val);
        return result;
    }
}
