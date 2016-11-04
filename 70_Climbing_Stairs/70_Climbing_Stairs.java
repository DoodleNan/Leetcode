public class Solution {
    public int climbStairs(int n) {
        if(n == 0 || n==1 || n==2) return n;
        int i = 3;
        int x = 1;
        int y = 2;
        int result = 0;
        while(i<=n){
            result = x + y;
            x = y;
            y = result;
            i++;
        }
        return result;
    }
}
