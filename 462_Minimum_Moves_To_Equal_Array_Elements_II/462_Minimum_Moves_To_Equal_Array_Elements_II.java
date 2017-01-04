public class Solution {
    public int minMoves2(int[] nums) {
        int result = 0;
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int median = nums[nums.length/2];
        for(int i:nums) result += Math.abs(i-median);
        return result;
    }
}
