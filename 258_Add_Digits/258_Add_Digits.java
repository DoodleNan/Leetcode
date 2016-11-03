public class Solution {
    public int addDigits(int num) {
         while(true){
             String s = Integer.toString(num);
             int result = 0;
             for(char c : s.toCharArray()) result += c-'0';
             if(result<10) return result;
             num = result;
         }
    }
}
