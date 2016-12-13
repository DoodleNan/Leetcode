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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null) return result;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<Integer> level = new ArrayList<Integer>();
        q.add(root);
        q.add(null);
        while(q.size()!=0){
            TreeNode current = q.poll();
            if(current == null) {
                result.add(new ArrayList<Integer>(level));
                level.clear();
                if(q.size() != 0){
                    q.offer(null);
                }
            }else{
                level.add(current.val);
                if(current.left != null){
                    q.offer(current.left);
                }
                if(current.right != null){
                    q.offer(current.right);
                }
            }
        }
        return result;
    }
}
