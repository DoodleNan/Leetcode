public class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if(length == 0 ||length == 1){
            return length;
        }
        int result = 0;
        for(int i = 1; i<length; i++){
            if(nums[i] != nums[result]){
                nums[result+1] = nums[i];
                result++;
            }
        }
        return result+1;
        
    }
}
