public class Solution {
    public int longestValidParentheses(String s) {
        // Stack<Integer> stack = new Stack<Integer>();
        // for(int i = 0; i<s.length(); i++){
        //     char c = s.charAt(i);
        //     if(c == '('){
        //         stack.push(i);
        //     }else{
        //         if(!stack.isEmpty() && s.charAt(stack.peek()) == '('){
        //             stack.pop();
        //         }else{
        //             stack.push(i);
        //         }
        //     }
        // }
        // if(stack.isEmpty()) return s.length();
        // int pre = s.length();
        // int cur = 0;
        // int result = 0;
        // while(!stack.isEmpty()){
        //     cur = stack.pop();
        //     result = pre - cur - 1 > result? pre-cur-1:result;
        //     pre = cur;
        // }
        // return cur>result?cur:result;
        if(s.length() == 0) return 0;
        int []dp = new int[s.length()];
        int result = 0;
        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i) == ')'){
                if(s.charAt(i-1) == '(') dp[i] = i-2>=0?dp[i-2]+2:2;
                else{
                    int pos = i-1-dp[i-1];
                    if(pos < 0) dp[i] = 0;
                    else if(pos == 0){
                        if(s.charAt(pos) == '(') dp[i] = dp[i-1] + 2;
                    }else{
                        if(s.charAt(pos) == '(') dp[i] = dp[i-1] + dp[pos-1] + 2;
                    }
                    //if(pos >= 0 && s.charAt(pos) == '(') dp[i] = pos>0?dp[i-1] + 2 + dp[pos-1]:dp[i-1] + 2;
                }
            }
            result = result<dp[i]?dp[i]:result;
        }
        return result;
    }
}
