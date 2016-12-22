public class Solution {
    public int findMin(int[] nums) {
        int left = 0; 
        int right = nums.length-1;
        while(right > left){
            if(nums[left] == nums[right]) right--;
            else if(nums[left] < nums[right]){
                return nums[left];
            }else{
                int mid = (right + left)/2;
                if(nums[mid] < nums[right]){
                    right = mid;
                }else if(nums[mid] > nums[right]){
                    left = mid +1;
                }else{
                    int []copyleft = new int[mid+1];
                    int []copyright = new int[right-mid+1];
                    System.arraycopy(nums, 0, copyleft, 0, mid+1);
                    System.arraycopy(nums, mid, copyright, 0, right-mid+1);
                    return Math.min(findMin(copyleft), findMin(copyright));
                }
            }
            
        }
        return nums[left];
    }
}
