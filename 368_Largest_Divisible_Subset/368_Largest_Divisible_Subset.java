public class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        int maxNum = Integer.MIN_VALUE;
        int maxNumIndex = 0;
        if(nums.length == 0 || nums == null) return result;
        Arrays.sort(nums);
        int[] dp = new int[nums.length];
        int[] biggestDivisibleNumIndex = new int[nums.length];
        Arrays.fill(dp, 1);
        Arrays.fill(biggestDivisibleNumIndex, -1);
        for(int i = 0; i<nums.length;i++){
            for(int j = 0; j<i; j++){
                if(nums[i]%nums[j]==0 && dp[i]<=dp[j]+1){
                    dp[i] = dp[j]+1;
                    biggestDivisibleNumIndex[i] = j;
                }
            }
            if(dp[i]>=maxNum){
                maxNum = dp[i];
                maxNumIndex = i;
            }
        }
        while(maxNumIndex>=0){
            result.add(nums[maxNumIndex]);
            maxNumIndex = biggestDivisibleNumIndex[maxNumIndex];
        }
        return result;
    }
}
