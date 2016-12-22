public class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
        for(char c : s.toCharArray()){
            if(!hm.containsKey(c)){
                hm.put(c,1);
            }else{
                hm.put(c, hm.get(c)+1);
            }
        }
        int result = Integer.MAX_VALUE;
        for(Map.Entry e:hm.entrySet()){
            if((int)e.getValue() == 1){
                int temp = s.indexOf((char)e.getKey());
                if(temp < result) result = temp;
            }
        }
        return result == Integer.MAX_VALUE? -1:result;
    }
}
