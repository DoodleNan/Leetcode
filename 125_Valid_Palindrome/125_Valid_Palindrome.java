public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        if(s == null || s.length() == 0) return true;
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            char head = s.charAt(i);
            char rear = s.charAt(j);
            if(Character.isLetter(head) || Character.isDigit(head)){
                if(Character.isLetter(rear) || Character.isDigit(rear)){
                    if(head != rear) return false;
                    i++;
                    j--;
                }else j--;
            }else{
                i++;
                if(!(Character.isLetter(rear) || Character.isDigit(rear))) j--;
            }
            
        }
        return true;
    }
}
