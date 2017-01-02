public class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<Integer>();
        Stack<String> resStack = new Stack<String>();
        int count = 0;
        String res = "";
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                count = count*10+c-'0';
            }else if(c == '['){
                resStack.push(res);
                countStack.push(count);
                count = 0;
                res = "";
            }else if(c == ']'){
                StringBuilder sb = new StringBuilder(resStack.pop());
                int times = countStack.pop();
                for(int j = 0; j<times; j++){
                    sb.append(res);
                }
                res = sb.toString();
            }else{
                res += c;
            }
        }
        return res;
    }
}
