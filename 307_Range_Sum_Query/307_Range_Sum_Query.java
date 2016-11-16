public class NumArray {
    
    private int[] block;
    private int[] nums;
    private int length;
    public NumArray(int[] nums) {
        if(nums.length == 0) return;
        this.nums = nums;
        length = (int) Math.ceil(Math.sqrt(nums.length));
        block = new int[length];
        for(int i = 0; i<nums.length; i++){
            block[i/length] += nums[i];
        }
    }

    void update(int i, int val) {
        block[i/length] = block[i/length] - nums[i] + val;
        nums[i] = val;
    }

    public int sumRange(int i, int j) {
        int result = 0;
        int startBlock = i/length;
        int endBlock = j/length;
        int index;
        if(startBlock == endBlock){
            for(index = i; index <= j; index++){
                result += nums[index];
            }
        }else{
            for(index = startBlock+1; index <= endBlock-1; index++){
                result += block[index];
            }
            
            for(index = i; index <= (startBlock+1)*length-1; index++){
                result += nums[index];
            }
            
            for(index = j; index >= endBlock*length; index--){
                result += nums[index];
            }
        }
        return result;
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.update(1, 10);
// numArray.sumRange(1, 2);
