public class Solution {
    public String intToRoman(int num) {
        char []table = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
        StringBuffer result = new StringBuffer();
        int []array = new int[4];
        String num_s = Integer.toString(num);
        int length = num_s.length();
        int j = 3;
        for(int i = length-1; i>=0;i--,j--){
            array[j] = num_s.charAt(i)-48;
        }
        
        for(int i = 0; i < array[0]; i++){
            result.append("M");
        }
        
        int shang = array[1]/5;
        int remainder = array[1]%5;
        if(shang > 0){
            if(array[1] == 9){
                result.append(table[2]);
                result.append(table[0]);
            }
            else{
                result.append(table[1]);
                for(int i = 0; i<remainder; i++){
                    result.append(table[2]);
                }
            }
        }
        else{
            if(remainder == 4){
                result.append(table[2]);
                result.append(table[1]);
            }
            else{
                for(int i = 0; i<remainder; i++){
                    result.append(table[2]);
                }
            }
        }
        
        shang = array[2]/5;
        remainder = array[2]%5;
        if(shang > 0){
            if(array[2] == 9){
                result.append(table[4]);
                result.append(table[2]);
            }
            else{
                result.append(table[3]);
                for(int i = 0; i<remainder; i++){
                    result.append(table[4]);
                }
            }
        }
        else{
            if(remainder == 4){
                result.append(table[4]);
                result.append(table[3]);
            }
            else{
                for(int i = 0; i<remainder; i++){
                    result.append(table[4]);
                }
            }
        }
        
        shang = array[3]/5;
        remainder = array[3]%5;
        if(shang > 0){
            if(array[3] == 9){
                result.append(table[6]);
                result.append(table[4]);
            }
            else{
                result.append(table[5]);
                for(int i = 0; i<remainder; i++){
                    result.append(table[6]);
                }
            }
        }
        else{
            if(remainder == 4){
                result.append(table[6]);
                result.append(table[5]);
            }
            else{
                for(int i = 0; i<remainder; i++){
                    result.append(table[6]);
                }
            }
        }
        return result.toString();
    }
}
