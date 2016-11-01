public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null)
            return 0;
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int result = 0;
        int i = 0;
        while(i<s.length()-result){
            int current = 0;
            for(int j = i; j<s.length();j++){
                if(!hm.containsKey(s.charAt(j)) || hm.get(s.charAt(j)) == j){
                    current++;
                    hm.put(s.charAt(j),j);
                    if(current > result)
                        result = current;
                }else{
                    int index = hm.get(s.charAt(j));
                    i = index+1;
                    //hm.clear();
                    break;
                }
            }
        }
        return result;
    }
}
