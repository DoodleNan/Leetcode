public class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len == 0 || len == 1) return s;
        int max = 1;
        int start = 0;
        int end = 0;
        if(len == 1 || len == 0) return s;
        char []array = s.toCharArray();
        for(int center = 0; center<len-1; center++){
            //odd length
            int low = center;
            int high = center;
            while(low-1>=0 && high+1 < len && array[low-1] == array[high+1]){
                low--;
                high++;
            }
            if(high-low+1>max){
                start = low;
                end = high;
                max = high-low+1;
            }
            
            if(array[center] == array[center+1]){
                low = center;
                high = center+1;
                while(low-1>=0 && high+1 < len && array[low-1] == array[high+1]){
                    low--;
                    high++;
                }
                if(high-low+1>max){
                    start = low;
                    end = high;
                    max = high-low+1;
                }
            }
        }
        return s.substring(start, end+1);
    }
}
