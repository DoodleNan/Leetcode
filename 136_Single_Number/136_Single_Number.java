public class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i : nums){
            if(set.contains(i)) set.remove(i);
            else set.add(i);
        }
        return (int)set.iterator().next();
    }
}
