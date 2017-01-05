public class Solution {
    public void sortColors(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return;
        int zeroEnd = -1;
        int twoStart = nums.length;
        int i = 0;
        while(i<twoStart){
            if(nums[i] == 0 && i != zeroEnd){
                zeroEnd++;
                swap(nums, zeroEnd, i);
            }else if(nums[i] == 2 && i != twoStart){
                twoStart--;
                swap(nums, twoStart, i);
            }else i++;
        }
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
