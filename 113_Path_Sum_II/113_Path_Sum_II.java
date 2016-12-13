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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> prefix = new ArrayList<Integer>();
        dfs(result, prefix, root, sum);
        return result;
    }
    
    private void dfs(List<List<Integer>> result, List<Integer> prefix, TreeNode root, int sum){
        if(root == null) return;
        List<Integer> temp = new ArrayList<Integer>(prefix);
        if(root.left == null && root.right == null){
            if(root.val == sum){
                temp.add(root.val);
                result.add(temp);
            }
        }else{
            temp.add(root.val);
            dfs(result, temp, root.left, sum-root.val);
            temp = prefix;
            temp.add(root.val);
            dfs(result, temp, root.right, sum-root.val);
        }
    }
}
