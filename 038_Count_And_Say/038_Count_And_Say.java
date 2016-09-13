public class Solution {
    public String countAndSay(int n) {
        if(n == 1){
            return("1");
        }
		StringBuffer sb = new StringBuffer();
        sb.append("1");
        for(int i = 0; i<n-1; i++){
        	StringBuffer temp = new StringBuffer();
            int length = sb.length();
            int index = 0;
            for(int j = 0; j < length; j++){
                if(j == 0){
                    temp.append('1');
                    temp.append(sb.charAt(j));
                    continue;
                }
                
                else{
                    if(sb.charAt(j) == sb.charAt(j-1)){
                        temp.setCharAt(index,(char)(temp.charAt(index)+1));
                    }
                    else{
                        index += 2;
                        temp.append('1');
                        temp.append(sb.charAt(j));
                    }
                }
            }
            sb = temp;
        }
        return sb.toString();
    }
}
