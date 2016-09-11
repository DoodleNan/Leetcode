public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        int length = nums.length;
        int[]numbers = nums.clone();
        Arrays.sort(numbers);
        for(int i = 0; i<length-3; i++){
            for(int j = i+1; j<length-2; j++){
                int left = j+1;
                int right = length-1;
                while(left<right){
                    int sum = numbers[left]+numbers[right];
                    int targetSum = target - numbers[i] - numbers[j];
                    if(sum<targetSum){
                        left++;
                    }
                    else if(sum>targetSum){
                        right--;
                    }
                    else{
                        ArrayList<Integer> temp = new ArrayList<Integer>();
                        temp.add(numbers[i]);
                        temp.add(numbers[j]);
                        temp.add(numbers[left]);
                        temp.add(numbers[right]);
                        result.add(temp);
                        left++;
                        right--;
                    }
                }
            }
        }
        
        HashSet h = new HashSet(result);
        result.clear();
        result.addAll(h);
        return (List)result;
    }
}
