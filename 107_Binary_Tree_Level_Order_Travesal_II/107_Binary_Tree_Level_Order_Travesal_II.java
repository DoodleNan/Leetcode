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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        if(root == null) return result;
        Queue q = new LinkedList<TreeNode>();
        q.offer(root);
        q.offer(null);
        while(q.size()!=0){
            TreeNode node = (TreeNode)q.poll();
            if(node!=null){
                temp.add(node.val);
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }else{
                result.add(new ArrayList(temp));
                temp.clear();
                if(q.size()!=0) q.offer(null);
            }
        }
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int len = result.size();
        for(int i = len-1; i>=0; i--){
            res.add(result.get(i));
        }
        return res;
    }
}
