public class Solution {
    public boolean isSubsequence(String s, String t) {
        int si = 0;
        int ti = 0;
        while(si < s.length() && ti < t.length()){
            if(s.charAt(si) == t.charAt(ti)){
                si++;
                ti++;
            }else{
                ti++;
            }
        }
        if(si == s.length()) return true;
        else return false;
    }
}
