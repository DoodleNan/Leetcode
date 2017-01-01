public class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int [][]dp = new int[m+1][n+1];
        for(String str: strs){
            int []count = helper(str);
            for(int i = m; i>=count[0]; i--){
                for(int j = n; j>=count[1]; j--){
                    dp[i][j] = Math.max(dp[i][j], dp[i-count[0]][j-count[1]]+1);
                }
            }
        }
        return dp[m][n];
    }
    
    private int [] helper(String s){
        int []result = new int[2];
        for(char c : s.toCharArray()){
            if(c == '0') result[0]++;
            if(c == '1') result[1]++;
        }
        return result;
    }
}
