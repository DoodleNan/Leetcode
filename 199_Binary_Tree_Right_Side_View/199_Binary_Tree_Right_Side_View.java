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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Queue q = new LinkedList<Integer>();
        if(root == null) return result;
        q.offer(root);
        q.offer(null);
        while(q.size()!=0){
            TreeNode node = (TreeNode)q.poll();
            if(node != null){
                if(q.peek()==null) result.add(node.val);
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }else{
                if(q.size()!=0){
                    q.offer(null);
                }
            }
        }
        return result;
    }
    
    
}
