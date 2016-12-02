public class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        if(len == 1 || len == 0) return;
        else{
            if(nums[len-2] < nums[len-1]){
                int temp = nums[len-1];
                nums[len-1] = nums[len-2];
                nums[len-2] = temp;
            }else{
                int index = len-2;
                while(index-1 >= 0 && nums[index-1] >= nums[index]){
                    index--;
                }
                if(index-1<0) Arrays.sort(nums);
                else{
                    Arrays.sort(nums, index, len);
                    int i;
                    for(i = index; i<len; i++){
                        if(nums[i]>nums[index-1]) break;
                    }
                    
                    int temp = nums[i];
                    nums[i] = nums[index-1];
                    nums[index-1] = temp;
                    Arrays.sort(nums, index, len);
                }
                    
            }
            
        }
    }
}
