public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> prefix = new ArrayList<Integer>();
        compute(result, prefix, 0, target, candidates);
        HashSet h = new HashSet(result);
        result.clear();
        result.addAll(h);
        return result;
    }
    
    public void compute(List<List<Integer>> result, List<Integer> prefix, int start, int target,int [] candidate){
        if(target == 0) {
            Collections.sort(prefix);
            result.add(prefix);
            return;
        }
        if(start >= candidate.length) return;
        else{
            if(candidate[start] <= target){
                ArrayList<Integer> temp = new ArrayList<Integer>(prefix);
                temp.add(candidate[start]);
                compute(result, temp, start+1, target-candidate[start], candidate);
            }
            compute(result, prefix, start+1, target, candidate);
        }
    }
}
