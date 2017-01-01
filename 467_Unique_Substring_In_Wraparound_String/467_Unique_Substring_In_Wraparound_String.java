public class Solution {
    public int findSubstringInWraproundString(String p) {
        String s = p;
        int [] count = new int[26];
        int curMaxLen = 1;
        for(int i = 0; i<p.length(); i++){
            if(i > 0 && (s.charAt(i) - s.charAt(i-1) == 1 || s.charAt(i) - s.charAt(i-1) == -25)) curMaxLen++;
            else curMaxLen = 1;
            count[s.charAt(i)-'a'] = Math.max(count[s.charAt(i)-'a'], curMaxLen);
        }
        int sum = 0;
        for(int i:count) sum+=i;
        return sum;
    }
}
