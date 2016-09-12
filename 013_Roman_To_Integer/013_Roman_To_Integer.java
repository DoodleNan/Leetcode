public class Solution {
    public int romanToInt(String s) {
        //String []table = {"I", "V", "X", "L", "C", "D", "M"};
        Map map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);        
        map.put('M', 1000);
        int result = 0;
        int length = s.length();
        for(int i = 0; i<length-1; i++){
            char ch = s.charAt(i);
            int value = (int)map.get(ch);
            char chNext = s.charAt(i+1);
            int valueNext = (int)map.get(chNext);
            if(value >= valueNext){
                result += value;
            }
            else{
                result -= value;
            }
        }
        result += (int)map.get(s.charAt(length-1));
        return result;
    }
}
