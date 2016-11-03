public class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        while(true){
            int result = 0;
            String num = Integer.toString(n);
            for(int i = 0; i<num.length();i++) result += (num.charAt(i)-'0')*(num.charAt(i)-'0');
            if(result == 1) return true;
            if(!hm.containsKey(result)){
                hm.put(result,0);
                n = result;
            }
            else return false; 
        }
    }
}
