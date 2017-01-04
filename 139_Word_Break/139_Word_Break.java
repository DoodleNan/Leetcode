public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        // if(s.length() == 0) return true;
        // for(int i = 0; i<s.length(); i++){
        //     String cur = s.substring(0,i+1);
        //     if(wordDict.contains(cur) && wordBreak(s.substring(i+1, s.length()), wordDict)) return true;
        // }
        // return false;
        boolean []dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int i = 1; i<=s.length(); i++){
            for(String str:wordDict){
                int dicLen = str.length();
                if(i>=dicLen){
                    if(dp[i-dicLen] && s.substring(i-dicLen,i).equals(str)) dp[i] = true;
                }
            }
        }
        return dp[s.length()];
    }
}
