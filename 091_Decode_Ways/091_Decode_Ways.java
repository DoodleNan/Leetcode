public class Solution {
    public int numDecodings(String s) {
        int length = s.length();
        int[] result = new int[length];
        if(length == 0 || s.charAt(0) == '0'){
            return 0;
        }
        
        else if(length == 1){
            return 1;
        }
        
        else{
            result[0] = 1;
            if(s.charAt(0) == '1'){
                if(s.charAt(1) != '0'){
                    result[1] = 2;
                }
                else{
                   result[1] = 1; 
                }
            }
            else if(s.charAt(0) == '2'){
                if(s.charAt(1) < '7' && s.charAt(1) > '0'){
                    result[1] = 2;
                }
                else{
                    result[1] = 1;
                }
            }
            else{
                if(s.charAt(1) == '0'){
                    return 0;
                }
                else{
                    result[1] = 1;
                }
            }
            
            for(int i = 2;i<length;i++){
                if(s.charAt(i) == '0'){
                    if(s.charAt(i-1) != '1' && s.charAt(i-1) != '2'){
                        return 0;
                    }
                    else{
                        result[i] = result[i-2];
                        continue;
                    }
                }
                if(s.charAt(i-1)=='1' && s.charAt(i) != '0'){
                    result[i] = result[i-1] + result[i-2];
                }
                else if(s.charAt(i-1) == '2'){
                    if(s.charAt(i) < '7' && s.charAt(i) > '0'){
                        result[i] = result[i-1] + result[i-2];
                    }
                    else{
                        result[i] = result[i-1];
                    }
                }
                else{
                    result[i] = result[i-1];
                }
            }
        }
        return result[length-1];
    }
}
