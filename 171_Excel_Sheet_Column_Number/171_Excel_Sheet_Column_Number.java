public class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        for(int i = 0; i<s.length();i++){
            result += (s.charAt(i) -'A' + 1)*Math.pow(26,s.length()-1-i);
        }
        return result;
    }
}
