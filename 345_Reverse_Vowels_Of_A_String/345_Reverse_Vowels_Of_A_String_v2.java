public class Solution {
    public String reverseVowels(String s) {
        int len = s.length();
        String vowels = "aeiouAEIOU";
        int low = 0;
        int high = len-1;
        char []array = s.toCharArray();
        while(low<high){
            while(low<len && vowels.indexOf(array[low]) == -1) low++;
            while(high>=0 && vowels.indexOf(array[high]) == -1) high--;
            if(low < high){
                char temp = array[low];
                array[low] = array[high];
                array[high] = temp;
                low++;
                high--;
            }
        }
        return String.valueOf(array);
    }
}
