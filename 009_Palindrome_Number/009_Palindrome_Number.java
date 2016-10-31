public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String s = Integer.toString(x);
        int i = 0;
        int j = s.length()-1;
        if(s.charAt(0) == '-')
            i = 1;
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
