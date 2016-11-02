public class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        digits[digits.length-1] += 1;
        for(int i = digits.length-1; i>=0;i--){
            digits[i] += carry;
            if(digits[i] >= 10){
                digits[i] -= 10;
                carry = 1;
            }else carry = 0;
        }
        
        if(carry != 1){
           return digits;
        }
        int[] result = new int[digits.length+1];
        result[0] = 1;
        System.arraycopy(digits,0,result,1,digits.length);
        return result;
    }
}
