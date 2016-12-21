public class Solution {
    public int maxProduct(String[] words) {
        int []nums = new int[words.length];
        for(int i = 0; i<words.length; i++){
            for(int j = 0; j<words[i].length(); j++){
                nums[i] |= 1<<words[i].charAt(j)-'a';
            }
        }
        int result = 0;
        for(int i = 0; i<words.length-1; i++){
            for(int j = i+1; j<words.length; j++){
                if((nums[i] & nums[j]) == 0){
                    int temp = words[i].length() * words[j].length();
                    if(temp > result) result = temp;
                }
            }
        }
        return result;
    }
}
