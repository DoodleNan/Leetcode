public class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        if(len == 0) return 0;
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        for(int i = 1; i<len; i++){
            int temp = max;
            max = Math.max(Math.max(nums[i]*max, nums[i]*min), nums[i]);
            min = Math.min(Math.min(temp*nums[i], nums[i]*min), nums[i]);
            if(max>result) result = max;
        }
        return result;
    }
}
