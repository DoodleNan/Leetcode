public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n <= 0){
            return;
        }else if(m <= 0){
            System.arraycopy(nums2, 0, nums1, 0, nums2.length);
        }else{
            int i1 = m-1;
            int i2 = n-1;
            int index = m+n-1;
            while(i2 >=0){
                if(i1 < 0){
                    nums1[index] = nums2[i2];
                }else{
                    nums1[index] = nums1[i1]>nums2[i2]?nums1[i1]:nums2[i2];
                }
                if(nums1[index] == nums2[i2])
                    i2--;
                else
                    i1--;
                index--;
            }
        }
        
    }
}
