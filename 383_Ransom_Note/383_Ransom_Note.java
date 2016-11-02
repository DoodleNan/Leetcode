public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] magFre = new int[26];
        for(int i = 0; i<magazine.length();i++){
            magFre[magazine.charAt(i) - 'a']++; 
        }
        
        for(int i = 0; i<ransomNote.length();i++){
            magFre[ransomNote.charAt(i) - 'a']--;
            if(magFre[ransomNote.charAt(i) - 'a'] == -1) return false;
        }
        
        return true;
    }
}
