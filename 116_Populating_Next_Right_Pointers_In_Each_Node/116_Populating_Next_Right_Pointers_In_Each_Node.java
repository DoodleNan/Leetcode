/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null) return;
        Queue q = new LinkedList<TreeLinkNode>();
        q.offer(root);
        q.offer(null);
        while(q.size()!=0){
            TreeLinkNode node = (TreeLinkNode)q.poll();
            if(node != null){
                if(q.peek() != null) node.next = (TreeLinkNode)q.peek();
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }else{
                if(q.size()!=0) q.offer(null);
            }
        }
    }
}
