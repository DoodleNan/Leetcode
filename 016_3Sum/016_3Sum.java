public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closestSum = 0;
        for(int i = 0; ;i++){
            closestSum = target + i;
            Find f = new Find();
            if(f.find(closestSum,nums)){
                break;
            }
            closestSum = target - i;
            if(f.find(closestSum,nums)){
                break;
            }
        }
        return closestSum;
    }
    
    public class Find{
        private boolean find(int _3Sum, int []nums){
            int[] numbers = nums.clone();
            Arrays.sort(numbers);
            int length = nums.length;
            
            for(int i = 0; i<length-2; i++){
                int _2Sum = _3Sum - numbers[i];
                int left = i + 1;
                int right = length - 1;
                while(left<right){
                    int sum = numbers[left] + numbers[right];
                    if(sum>_2Sum){
                        right--;
                    }
                    else if(sum<_2Sum){
                        left++;
                    }
                    else{
                        return true;
                    }
                }
            }
            return false;
        }
    }
    
}
