public class Solution {
    public int countSegments(String s) {
        s = ' ' + s;
        int result = 0;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) != ' ' && s.charAt(i-1) == ' ') result++;
        }
        return result;
    }
}
