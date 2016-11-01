public class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length-1;
        while(i<=j){
            if(nums[i] == val){
                while(nums[j] == val){
                    j--;
                    if(j <= i){
                        return i;
                    }
                }
                nums[i] = nums[j];
                i++;
                j--;
            }else{
                i++;
            }
        }
       return i; 
    }
}
