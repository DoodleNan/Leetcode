public class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return nums[0] > nums[1]?nums[0] : nums[1];
        long max = Long.MIN_VALUE;
        long secMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]>max){
                thirdMax = secMax;
                secMax = max;
                max = nums[i];
            }else if(nums[i] < max && nums[i]>secMax){
                thirdMax = secMax;
                secMax = nums[i];
            }else if(nums[i] < secMax && nums[i]>thirdMax){
                thirdMax = nums[i];
            }
        }
        if(thirdMax == Long.MIN_VALUE) return (int)max;
        return (int)thirdMax;
    }
}
