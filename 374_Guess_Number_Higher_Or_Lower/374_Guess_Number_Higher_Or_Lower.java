/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1; 
        int high = n;
        int mid;
        while(low<=high){
            mid = low+(high-low)/2;
            int res = guess(mid);
            if(res == 0) return mid;
            else if(res == 1){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}
