public class Solution {
    // private int min = Integer.MAX_VALUE;
    // public int minimumTotal(List<List<Integer>> triangle) {
    //     int result = Integer.MAX_VALUE;
    //     generate(0, 0, 0, triangle);
    //     return min;
    // }
    
    // public void generate(int row, int index, int pre, List<List<Integer>> triangle){
    //     if(row == triangle.size()-1){
    //         if(pre+triangle.get(row).get(index) < min) min = pre+triangle.get(row).get(index);
    //     }else{
    //         for(int i = index; i<=index+1; i++){
    //             if(triangle.get(row+1) != null && i>=0 && i<triangle.get(row+1).size())
    //                 generate(row+1, i, pre+triangle.get(row).get(index), triangle);
    //         }
    //     }
    // }
    public int minimumTotal(List<List<Integer>> triangle) {
        int result = Integer.MAX_VALUE;
        int row = triangle.size();
        if(row == 0) return 0;
        int []dp = new int[row];
        dp[0] = triangle.get(0).get(0);
        for(int i = 1; i<row; i++){
            int size = triangle.get(i).size();
            dp[size-1] = dp[size-2] + (int)triangle.get(i).get(size-1);
            for(int j = size-2; j>0; j--){
                dp[j] = dp[j] < dp[j-1] ? dp[j] + (int)triangle.get(i).get(j):dp[j-1] + (int)triangle.get(i).get(j);
            }
            dp[0] += (int)triangle.get(i).get(0);
        }
        for(int i : dp) result = result < i ? result:i;
        return result;
    }
}
