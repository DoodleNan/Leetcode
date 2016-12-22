public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i:nums1){
            if(!hm.containsKey(i)) hm.put(i, 1);
            else hm.put(i, hm.get(i)+1);
        }
        for(int i: nums2){
            if(hm.containsKey(i) && hm.get(i) > 0){
                arr.add(i);
                hm.put(i, hm.get(i)-1);
            }
        }
        int []result = new int[arr.size()];
        for(int i = 0; i<arr.size(); i++) result[i] = arr.get(i);
        return result;
    }
}
