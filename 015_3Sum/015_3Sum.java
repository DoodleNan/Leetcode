public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        //ArrayList<Integer> temp = new ArrayList<Integer>();
        int[] numbers = nums.clone();
        Arrays.sort(numbers);
        int length = nums.length;
        
        for(int i = 0; i<length; i++){
        	if(i>0&&numbers[i] == numbers[i-1]){
        		continue;
        	}
            int target = -numbers[i];
            int left = i+1;
            int right = length-1;
            while(left<right){
                int sum = numbers[left]+numbers[right];
                if(sum>target){
                    right--;
                }
                else if(sum<target){
                    left++;
                }
                else{
                	ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(numbers[i]);
                    temp.add(numbers[left]);
                    temp.add(numbers[right]);
                    result.add(temp);
                    while(right > 2 && numbers[right-1] == numbers[right]){
                        right--;
                    }
                    while(left < length-2 && numbers[left+1] == numbers[left]){
                        left++;
                    }
                    right--;
                    left++;
                }
            }
        }
         return (List)result;
    }
}
