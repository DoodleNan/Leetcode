public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        List<Integer> prefix = new ArrayList<Integer>();
        compute(result, prefix, target, candidates.length-1, candidates);
        return result;
    }
    
    public void compute(List<List<Integer>> result, List<Integer> prefix, int remaining, int index, int[]candidates){
        if(index < 0) return;
        if(remaining == 0) result.add(new ArrayList<Integer>(prefix));
        else{
            if(candidates[index] <= remaining){
                prefix.add(candidates[index]);
                compute(result, prefix, remaining-candidates[index],index,candidates);
                prefix.remove(prefix.size()-1);
            }
            compute(result, prefix,remaining,index-1,candidates);
            
        }
    }
}
