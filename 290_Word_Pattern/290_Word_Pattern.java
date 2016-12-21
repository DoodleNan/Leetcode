public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String []strs = str.split(" ");
        HashMap<Character, String> hm = new HashMap<Character, String>();
        if(pattern.length() != strs.length) return false;
        for(int i = 0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            String s = strs[i];
            if(hm.containsKey(c)){
                if(!((String)hm.get(c)).equals(s)) return false;
            }else{
                if(hm.containsValue(s)) return false;
                else{
                    hm.put(c,s);
                }
            }
        }
        return true;
    }
}
