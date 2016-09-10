
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] numbers = nums.clone();
        Arrays.sort(numbers);
        
        int length = numbers.length;
        int left = 0;
        int right = length - 1;
        int sum = 0;
        
        int[] result = new int[2];
        while(left < right){
            sum = numbers[left] + numbers[right];
            if(sum > target)
                right--;
            else if(sum < target)
                left++;
            else{
                boolean leftFinished = false;
                for(int i = 0; i<length;i++){
                    if(nums[i] == numbers[left] && !leftFinished){
                        result[0] = i;
                        leftFinished = true;
                    }
                    else if(nums[i] == numbers[right]){
                        result[1] = i;
                    }
                }
                break;
            }
        }
        return result;
    }
}
