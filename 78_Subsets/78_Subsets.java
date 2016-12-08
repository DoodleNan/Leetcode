public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        ArrayList<Integer> prefix = new ArrayList<Integer>();
        dfs(result, prefix, 0, nums);
        return result;
    }
    
    private void dfs(List<List<Integer>> result, ArrayList<Integer> prefix, int start, int[] nums){
        if(start == nums.length) result.add(prefix);
        else{
            dfs(result, prefix, start+1, nums);
            ArrayList<Integer> temp = new ArrayList<Integer>(prefix);
            temp.add(nums[start]);
            dfs(result, temp, start+1, nums);
        }
    }
}
