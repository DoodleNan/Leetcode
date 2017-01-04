public class Solution {
    public int minMoves(int[] nums) {
        int result = 0;
        int min = Integer.MAX_VALUE;
        for(int i : nums) min = min<i?min:i;
        for(int i : nums) result += i-min;
        return result;
    }
}
