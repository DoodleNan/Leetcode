public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();
        if(nums.length == 0) return result;
        for(int i = 0; i<nums.length; i++){
            int num = nums[i];
            while(i+1<nums.length && nums[i+1]-nums[i] == 1) i++;
            if(nums[i] == num) result.add(String.valueOf(num));
            else result.add(String.valueOf(num)+"->"+String.valueOf(nums[i]));
        }
        return result;
    }
}
