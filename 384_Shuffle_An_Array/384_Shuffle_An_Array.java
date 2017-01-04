public class Solution {
    
    int []origin;
    public Solution(int[] nums) {
        origin = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return origin;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int []copy = Arrays.copyOf(origin, origin.length);
        Random random = new Random();
        for(int i = 1; i<copy.length; i++){
            int index = random.nextInt(i+1);
            swap(copy, i, index);
        }
        return copy;
    }
    
    private void swap(int []arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
