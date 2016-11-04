public class Solution {
    public int uniquePaths(int m, int n) {
        if(m == 1 || n ==1) return 1;
        int numeratorTemp = m+n-2;
        m = Math.min(m,n);
        long denumeratorTemp = m-1;
        long denumerator = 1;
        long numerator = 1;
        for(int i = 1; i<=m-1; i++){
            numerator *= numeratorTemp;
            numeratorTemp--;
        }
        for(int i = 1; i<=m-1; i++){
            denumerator *= denumeratorTemp;
            denumeratorTemp--;
        }
        return (int) (numerator/denumerator);
    }
    

}
