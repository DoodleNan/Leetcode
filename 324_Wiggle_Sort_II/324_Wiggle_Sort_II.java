public class Solution {
    public void wiggleSort(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return;
        int []copy = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            copy[i] = nums[i];
        }
        Arrays.sort(copy);
        int left = (nums.length-1)/2;
        int right = nums.length-1;
        for(int i = 0; i<nums.length; i++){
            if(i%2==0){
                nums[i] = copy[left--];
            }else{
                nums[i] = copy[right--];
            }
        }
    }
}
