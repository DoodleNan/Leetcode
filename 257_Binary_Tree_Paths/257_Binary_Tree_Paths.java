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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        String prefix = "";
        dfs(result, prefix, root);
        return result;
    }
    
    private void dfs(List<String> result, String prefix, TreeNode root){
        if(root == null) return;
        String res = prefix + Integer.toString(root.val);
        if(root.left == null && root.right == null){
            result.add(res);
        }else{
            dfs(result, res+"->", root.left);
            dfs(result, res+"->", root.right);
        }
    }
}
