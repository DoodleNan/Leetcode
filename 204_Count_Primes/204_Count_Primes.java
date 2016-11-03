public class Solution {
    public int countPrimes(int n) {
        if(n <= 1) return 0;
        int result = 0;
        boolean[] isPrime = new boolean[n];
        for(int i = 1; i<n;i++) isPrime[i] = true;
        for(int i = 2; i*i<n; i++){
            if(isPrime[i]){
                for(int j = i*i; j<n;j=j+i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 2; i<n;i++){
            if(isPrime[i]) result++;
        }
        return result;
    }
}
