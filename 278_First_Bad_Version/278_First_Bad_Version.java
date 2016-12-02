/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        int mid;
        while(low<=high){
            mid = low + (high - low) / 2;
            if(isBadVersion(mid)){
                if(mid == 0) return 0;
                if(!isBadVersion(mid-1)) return mid;
                else high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
}
