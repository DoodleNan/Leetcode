public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        for(Integer i : nums1) set.add(i);
        Set<Integer> arr = new HashSet<Integer>();
        for(int i:nums2){
            if(set.contains(i)) arr.add(i);
        }
        Iterator<Integer> it = arr.iterator();
        int []result = new int[arr.size()];
        int index = 0;
        while(it.hasNext()) result[index++] = it.next();
        return result;
    }
}
