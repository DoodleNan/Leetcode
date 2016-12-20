public class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;
        int []sec = new int [10];
        int []gue = new int [10];
        for(int i = 0; i<secret.length(); i++){
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if(s == g) bull++;
            else{
                sec[s-'0']++;
                gue[g-'0']++;
            }
        }
        for(int i = 0; i<10; i++){
            cow+=Math.min(sec[i], gue[i]);
        }
        return bull + "A" + cow + "B";
    }
}
