public class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int insert = 0;
        while(i<nums.length){
            if(nums[i] == val){
                while(nums[i] == val){
                    i++;
                    if(i == nums.length)
                        break;
                }
                if(i<nums.length){
                    nums[insert] = nums[i];
                    insert++;
                    i++;
                }
            }else{
                nums[insert] = nums[i];
                i++;
                insert++;
            }
        }
        return insert;
    }
}
