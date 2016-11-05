public class Solution {
    public int combinationSum4(int[] nums, int target) {
        if(nums.length == 0 || target <= 0) return 0;
        int dp[] = new int[target+1];
        dp[0] = 1;
        for(int i = 1; i<=target; i++){
            int preDpIndex;
            for(int j = 0; j<nums.length;j++){
                preDpIndex = i - nums[j];
                if(preDpIndex>=0){
                    dp[i] += dp[preDpIndex];
                }
            }
        }
        
        return dp[target];
    }
}
