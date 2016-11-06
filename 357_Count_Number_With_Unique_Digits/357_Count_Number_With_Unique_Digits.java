public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0) return 1;
        int []array = new int[n+1];
        array[1] = 10;
        for(int i = 2; i<=n;i++){
            int start = 9;
            int factorial = 9;
            for(int j = 1; j<i; j++){
                factorial *= start;
                start--;
            }
            array[i] = array[i-1] + factorial;
        }
        return array[n];
    }
}
