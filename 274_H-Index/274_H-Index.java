public class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int len = citations.length;
        if(len == 0) return 0;
        for(int i = len; i>0; i--){
            if(i <= citations[len-i]) return i;
        }
        return 0;
    }
}
