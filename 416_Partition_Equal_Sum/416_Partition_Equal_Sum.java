public class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i:nums){
            sum += i;
        }
        if(sum%2==1)
            return false;
        int halfSum = sum/2;
        //HashMap<ArrayList<int>, boolean> hm = new HashMap<ArrayList<int>, boolean>();
        Arrays.sort(nums);
        return IsPartitionable(nums.length-1,halfSum,nums);
    }
    
    public boolean IsPartitionable(int index, int target, int[]nums){
        if(index < 0 ||target < 0)
            return false;
        if(target == 0)
            return true;
        for(int i = index; i >= 0;i--){
            if(nums[i] == target || IsPartitionable(i-1,target-nums[i],nums))
                return true;
        }
        return false;
    }
}
