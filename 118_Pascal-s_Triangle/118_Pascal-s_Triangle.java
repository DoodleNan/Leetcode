public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(numRows<=0) return result;
        ArrayList<Integer> pre = new ArrayList<Integer>();
        pre.add(1);
        result.add(pre);
        for(int i = 0; i<numRows-1; i++){
            ArrayList<Integer> cur = new ArrayList<Integer>();
            cur.add(1);
            for(int j = 0; j<pre.size()-1; j++){
                int temp = pre.get(j) + pre.get(j+1);
                cur.add(temp);
            }
            cur.add(1);
            result.add(cur);
            pre = cur;
        }
        
        return result;
    }
}
