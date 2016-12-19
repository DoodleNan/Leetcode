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
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> []result = new List[n+1];
        result[0] = new ArrayList<TreeNode>();
        if(n == 0) return result[0];
        result[0].add(null);
        for(int i = 1; i<=n; i++){ //result[]
            result[i] = new ArrayList<TreeNode>();
            for(int j = i; j>0; j--){ //root value
                for(TreeNode left:result[j-1]){
                    for(TreeNode right: result[i-j]){
                        TreeNode root = new TreeNode(j);
                        root.left = left;
                        root.right = copyTree(right, j);
                        result[i].add(root);
                    }
                }
            }
        }
        return result[n];
    }
    
    private TreeNode copyTree(TreeNode root, int offset){
        if(root == null) return null;
        TreeNode node = new TreeNode(root.val+offset);
        node.left = copyTree(root.left, offset);
        node.right = copyTree(root.right, offset);
        return node;
    }
}
