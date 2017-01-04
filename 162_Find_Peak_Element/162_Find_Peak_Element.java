public class Solution {
    public int findPeakElement(int[] nums) {
        // if(nums.length == 1) return 0;
        // if(nums[1]<nums[0]) return 0;
        // if(nums[nums.length-2]<nums[nums.length-1]) return nums.length-1;
        // for(int i= 1; i<nums.length-1; i++){
        //     if(nums[i]>nums[i-1] && nums[i+1]<nums[i]) return i;
        // }
        // return 0;
        
        // int max = nums[0];
        // int index = 0;
        // for(int i = 1; i<nums.length; i++){
        //     if(nums[i]>max){
        //         max = nums[i];
        //         index = i;
        //     }
        // }
        // return index;
        
        //find local maximum:
        int low = 0; 
        int high = nums.length-1;
        int mid1 = 0;
        int mid2 = 0;
        while(low<high){
            mid1 = (low+high)/2;
            mid2 = mid1+1;
            if(nums[mid2]>nums[mid1]) low = mid2;
            else high = mid1;
        }
        return high;
    }
}
