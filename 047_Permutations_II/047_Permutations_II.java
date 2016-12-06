public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        HashSet<List<Integer>> hs = new HashSet<List<Integer>>();
        permuteUnique(hs, nums, 0);
        Iterator it = hs.iterator();
        while(it.hasNext()){
            res.add((List)it.next());
        }
        return res;
    }
    
    private void permuteUnique(HashSet<List<Integer>> hs, int[] nums, int start){
        if(start == nums.length){
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i:nums) list.add(i);
            if(!hs.contains(list)) hs.add(list);
        }
        else{
            for(int i = start; i<nums.length; i++){
                int temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
                permuteUnique(hs, nums, start+1);
                temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
