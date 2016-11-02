public class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while(i>=0 || j>=0 || carry > 0){
            carry += i>=0?num1.charAt(i--)-'0':0;
            carry += j>=0?num2.charAt(j--)-'0':0;
            result.insert(0,(char)(carry%10+'0'));
            carry /= 10;
        }
        return result.toString();
    }
}
