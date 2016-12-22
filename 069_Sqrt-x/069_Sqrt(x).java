public class Solution {
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        int mid = 0;
        while(left <= right){
            mid = left + (right-left)/2;
            if(mid == x/mid) return (int)mid;
            else if(mid < x/mid) left = (int)mid+1;
            else right = (int)mid-1;
        }
        return left-1;
    }
}
