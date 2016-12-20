public class Solution {
    public int jump(int[] nums) {
        int last = 0;
        int max = nums[0];
        int step = 0;
        for(int i = 0; i<nums.length-1; i++){
            max = Math.max(nums[i]+i, max);
            if(i==last){
                step++;
                last = max;
            }
        }
        return step;
    }
}
