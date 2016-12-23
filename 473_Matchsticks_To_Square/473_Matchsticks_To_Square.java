public class Solution {
    public boolean makesquare(int[] nums) {
        int sum = 0;
        for(int i:nums){
            sum += i;
        }
        if(sum%4 != 0 || sum == 0) return false;
        return dfs(nums, new int[4], 0, sum/4);
    }
    
    private boolean dfs(int[] nums, int[] sums, int index, int target){
        if(index == nums.length && (sums[0] == sums[1] && sums[1] == sums[2])){
            return true;
        }else{
            for(int i = 0; i<4; i++){
                if(sums[i]+nums[index]<=target) {
                    sums[i] += nums[index];
                    if(dfs(nums, sums, index+1, target)) return true;
                    else{
                        sums[i] -= nums[index];
                    }
                }
            }
        }
        return false;
    }
}
