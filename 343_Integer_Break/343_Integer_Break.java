public class Solution {
    public int integerBreak(int n) {
        if(n == 3 || n == 2) return n-1;
        int result = 0;
        int x = n/3;
        int y = n%3;
        if(y == 0) result = (int)Math.pow(3,x);
        else if(y == 1) result = (int)Math.pow(3,x-1)*4;
        else result = result = (int)Math.pow(3,x)*2;
        return result;
    }
}
