public class Solution {
    public int maxSubArray(int[] nums) {
        int result = -100;
        int length = nums.length;
        if(length == 1){
            return nums[0];
        }
        int tempResult = 0;
        for(int i = 0; i<length;i++){
            if(nums[i]<0){
                if(nums[i]>result){
                    result = nums[i];
                }
                if(i!=length-1){
                    continue;
                }
                else{
                    if(nums[i]>=result){
                        result = nums[i];
                        return result;
                    }
                    else return result;
                }
            }
            int allSum = 0;
            for(int j = i; j<length;j++){
                allSum += nums[j];
            }
            tempResult = allSum;
            int temp = tempResult;
            for(int j = length-1; j>=i;j--){
                if(nums[j]>=0){
                    continue;
                }
                for(int k = length-1; k>=j;k--){
                    temp -= nums[k];
                }
                if(temp>tempResult){
                    tempResult = temp;
                }
                temp = allSum;
            }
            if(tempResult>result){
                result = tempResult;
            }
        }
        return result;
    }
}
