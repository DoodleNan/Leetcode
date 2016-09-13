public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if(strs.length == 0){
            return result;
        }
        else{
            result = strs[0];
            int length = strs.length;
            for(int i = 1;i<length;i++){
                //int validLength = result.length()>strs[i].length()?strs[i].length():result.length();
                for(int j = 0; j<result.length();j++){
                    if(j==strs[i].length()){
                        result = strs[i];
                        break;
                    }
                    if(strs[i].charAt(j) != result.charAt(j)){
                        if(j == 0){
                            return "";
                        }
                        else{
                            result = result.substring(0,j);
                        }
                        break;
                    }
                }
            }
        }
        return result;
    }
}
