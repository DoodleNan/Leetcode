public class Solution {
    public String reverseVowels(String s) {
        int length = s.length();
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        boolean []isVowel = new boolean[length];
        for(int i = 0; i<length;i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u'
            || s.charAt(i) == 'A' ||s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                isVowel[i] = true;
                sb.append(s.charAt(i));
            }
        }
        
        sb.reverse();
        int vowelIndex = 0;
        for(int i = 0; i < length; i++){
            if(isVowel[i]){
                result.append(sb.charAt(vowelIndex));
                vowelIndex++;
            }
            else{
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}
