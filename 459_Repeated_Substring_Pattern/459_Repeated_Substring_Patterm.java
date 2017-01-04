public class Solution {
    public boolean repeatedSubstringPattern(String str) {
        int len = str.length();
        for(int subLen = len/2; subLen>=1; subLen--){
            if(len%subLen==0){
                String sub = str.substring(0,subLen);
                StringBuilder sb = new StringBuilder(len);
                for(int i = 0; i<len/subLen; i++) sb.append(sub);
                if(sb.toString().equals(str)) return true;
            }
        }
        return false;
    }
}
