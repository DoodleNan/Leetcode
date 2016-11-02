public class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0) return 0;
        String[] array = s.split(" ");
        int size = array.length;
        if(size == 0) return 0;
        String result = array[size-1];
        return result.length();
    }
}
