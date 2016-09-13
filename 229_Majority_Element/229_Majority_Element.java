public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        
        if(nums.length == 0){
            return result;
        }
        if(nums.length == 1){
            result.add(nums[0]);
            return result;
        }
        int candidate1 = nums[0];
        int fre1 = 1;
        int candidate2 = 0;
        int fre2 = 0;

        for(int i = 1; i<nums.length;i++){
            if(nums[i] == candidate1){
                fre1++;
            }
            else if(nums[i] == candidate2){
                fre2++;
            }
            else{
                if(fre1 == 0){
                    candidate1 = nums[i];
                    fre1 = 1;
                }
                
                if(fre2 == 0){
                    candidate2 = nums[i];
                    fre2 = 1;
                }
                
                else{
                    fre1--;
                    fre2--;
                }
            }
        }
        fre1 = fre2 = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i] == candidate1){
                fre1++;
            }
            if(nums[i] == candidate2){
                fre2++;
            }
        }
        
        if(fre1 > (nums.length)/3){
            result.add(candidate1);
        }
        if(candidate2!= candidate1 && fre2 > (nums.length)/3){
            result.add(candidate2);
        }
        
        return result;
    }
}
