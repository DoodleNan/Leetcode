public class Solution {
    public int longestSubstring(String s, int k) {
        return helper(s, 0, s.length(), k);
    }
    private int helper(String s, int start, int end, int k){
        if(start>=end) return 0;
        int []count = new int[26];
        for(int i = start; i<end; i++) count[s.charAt(i)-'a']++;
        for(int i = 0; i<26; i++){
            if(count[i] > 0 && count[i] < k){
                for(int j = start; j<end; j++){
                    if(s.charAt(j) == i+'a'){
                        int left = helper(s, start, j, k);
                        int right = helper(s, j+1, end, k);
                        return Math.max(left, right);
                    }
                }
            }
        }
        return end-start;
    }

}
