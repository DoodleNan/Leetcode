public class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm = new HashMap<Character, Character>();
        for(int i = 0; i<s.length(); i++){
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            if(hm.containsKey(ss)){
                if((char)hm.get(ss) != tt) return false;
            }else{
                if(hm.containsValue(tt)){
                    return false;
                }else{
                    hm.put(ss,tt);
                }
            }
        }
        return true;
    }
}
