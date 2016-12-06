public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        permutations(result, nums, 0);
        return result;
    }
    
    private void permutations(List<List<Integer>> result, int[] nums, int start){
        if(start == nums.length) {
            List<Integer> list = new ArrayList<Integer>();
            for(int num : nums) list.add(num);
            result.add(list);
        }
        else{
            for(int i = start; i<nums.length; i++){
                int temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
                permutations(result, nums, start+1);
                temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
