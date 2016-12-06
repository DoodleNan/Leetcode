public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        permutations(result, new ArrayList<Integer>(), nums, 0);
        return result;
    }
    
    private void permutations(List<List<Integer>> result, ArrayList<Integer> prefix, int[] nums, int start){
        if(prefix.size() == nums.length) result.add(prefix);
        else{
            for(int i = start; i<nums.length; i++){
                int temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
                ArrayList<Integer> arr = new ArrayList<Integer>(prefix);
                arr.add(nums[start]);
                permutations(result, arr, nums, start+1);
                temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
