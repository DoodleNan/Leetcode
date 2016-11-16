public class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0) return 0;
        int result = 1;
        int []dp = new int[nums.length];
        dp[0] = 1;
        for(int i = 1; i < nums.length; i++){
            dp[i] = 1;
            for(int j = 0; j<i;j++){
                if(nums[j] < nums[i]) dp[i] = dp[i] > dp[j]+1?dp[i]:dp[j]+1;
            }
            if(dp[i]>result) result = dp[i];
        }
        return result;
    }
}
