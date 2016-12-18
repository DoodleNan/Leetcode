public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int start = 0;
        int end = 0;
        int result = Integer.MAX_VALUE;
        int sum = 0;
        while(end<nums.length){
            while(sum<s&&end<nums.length) sum+=nums[end++];
            if(sum<s) break;
            else{
                while(start>=0&&sum>=s) sum-=nums[start++];
                if(end-start+1<result) result = end-start+1;
            }
        }
        return result==Integer.MAX_VALUE?0:result;
    }
}
