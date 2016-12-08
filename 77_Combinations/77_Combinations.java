public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(k>n) return result;
        ArrayList<Integer> prefix = new ArrayList<Integer>();
        dfs(result, prefix,1,k,n);
        return result;
    }
    
    private void dfs(List<List<Integer>> result, ArrayList<Integer> prefix, int start, int remain, int total){
        if(remain == 0) result.add(new ArrayList<Integer>(prefix));
        else{
            for(int i = start; i<=total; i++){
                ArrayList<Integer> temp = new ArrayList<Integer>(prefix);
                temp.add(i);
                dfs(result, temp, i+1, remain-1, total);
            }
        }
    }
}
