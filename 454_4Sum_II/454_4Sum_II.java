public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int result = 0;
        HashMap<Integer, Integer> hm1 = new HashMap<Integer, Integer>();
        for(int i = 0; i<A.length; i++){
            for(int j = 0; j<B.length; j++){
                int sum = A[i] + B[j];
                if(!hm1.containsKey(sum)){
                    hm1.put(sum,1);
                }else{
                    hm1.put(sum, hm1.get(sum)+1);
                }
            }
        }
        
        for(int i = 0; i<C.length; i++){
            for(int j = 0; j<D.length;j++){
                int sum = -C[i] -D[j];
                if(hm1.containsKey(sum)) result += hm1.get(sum);
            }
        }
        return result;
    }
}
