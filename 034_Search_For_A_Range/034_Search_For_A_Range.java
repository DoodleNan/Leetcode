public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []res = new int[2];
        int low = 0;
        int high = nums.length-1;
        int mid = (low+high)/2;
        while(low<=high){
            mid = (high + low)/2;
            if(target == nums[mid]) break;
            else if(target<nums[mid]){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        if(low>high){
            res[0] = res[1] = -1;
        }else{
            low = high = mid;
            while(low-1>=0 && nums[low-1] == target){
                low--;
            }
            while(high+1<nums.length && nums[high+1] == target){
                high++;
            }
            res[0] = low;
            res[1] = high;
        }
        return res;
    }
}
