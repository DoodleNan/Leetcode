public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> prefix = new ArrayList<Integer>();
        compute(result, prefix, k, 1, n);
        return result;
    }
    
    public void compute(List<List<Integer>> result, List<Integer> prefix, int remaining,int start, int target){
        if(remaining == 0 && target == 0) result.add(prefix);
        if(remaining <= 0 || start > 9 || target <= 0) return;
        else{
            if(remaining > 0 && start <= 9 && start <= target){
                ArrayList<Integer> temp = new ArrayList<Integer>(prefix);
                temp.add(start);
                compute(result, temp, remaining-1, start+1, target-start);
            }
            compute(result, prefix, remaining, start+1, target);
        }
    }
}
