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
    public TreeNode sortedArrayToBST(int[] nums) {
         if(nums.length == 0) return null;
         TreeNode root = sort(nums, 0, nums.length-1);
         return root;
    }
    
    private TreeNode sort(int []nums, int start, int end){
        if(start>end) return null;
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sort(nums, start, mid-1);
        root.right = sort(nums, mid+1, end);
        return root;
    }
}
