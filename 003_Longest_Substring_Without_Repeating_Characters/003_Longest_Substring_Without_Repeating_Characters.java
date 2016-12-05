public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null||s.length()==0)
            return 0;
        int result = 0;
        HashSet<Character> hs = new HashSet<Character>();
        for(int i = 0; i<s.length(); i++){
            int length = 0;
            for(int j = i; j<s.length(); j++){
                if(hs.contains(s.charAt(j))){
                    break;
                }
                else{
                    hs.add(s.charAt(j));
                    length++;
                }
            }
            if(length>result) result = length;
            hs.clear();
        }
        return result;
    }
}
