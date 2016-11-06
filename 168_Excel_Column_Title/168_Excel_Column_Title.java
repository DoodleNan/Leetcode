public class Solution {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while(n!=0){
            if(n%26==0){
                result.append('Z');
                n -= 26;
            }else{
                result.append((char)(n%26-1+'A'));
            }
            n /= 26;
        }
        return result.reverse().toString();
    }
}
