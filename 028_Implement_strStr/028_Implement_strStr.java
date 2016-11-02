public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.equals(needle) || needle.length() == 0) return 0;
        int i;
        for(i = 0; i<=haystack.length()-needle.length();i++){
            int k = i;
            for(int j = 0; j<needle.length();j++){
                if(haystack.charAt(k) == needle.charAt(j) && j == needle.length()-1) return i;
                if(haystack.charAt(k) != needle.charAt(j))
                    break;
                k++;
                if(k == haystack.length()){
                    if(j == needle.length()-1) return i;
                    else return -1;
                }    
            }
        }
       return -1;
    }
}
