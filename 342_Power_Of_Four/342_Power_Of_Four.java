public class Solution {
    public boolean isPowerOfFour(int num) {
        if(num < 1){
            return false;
        }
        
        while(num%4 == 0){
            num = num/4;
        }
        
        if(num == 1){
            return true;
        }
        
        else{
            return false;
        }
    }
}
