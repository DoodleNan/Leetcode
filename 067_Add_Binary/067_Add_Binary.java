public class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        String s = "";
        int i = a.length()-1;
        int j = b.length()-1;
        while(i>=0 || j >=0 || carry > 0){
            carry += i>=0?a.charAt(i--)-'0':0;
            carry += j>=0?b.charAt(j--)-'0':0;
            s = (char)((carry%2)+'0') + s;
            carry = carry/2;
        }
        return s;
    }
}
