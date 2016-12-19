public class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        s = s.replaceAll(" ", "");
        int len = s.length();
        int sign = 1;
        int num = 0;
        int result = 0;
        for(int i = 0; i<len; i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                num = num*10+c-'0';
            }
            else{
                if(c == '+'){
                    result += sign*num;
                    num = 0;
                    sign = 1;
                }
                if(c == '-'){
                    result += sign*num;
                    num = 0;
                    sign = -1;
                }
                if(c == '('){
                    stack.push(sign);
                    stack.push(result);
                    result = 0;
                    num = 0;
                    sign = 1;
                }
                if(c == ')'){
                    result += sign*num;
                    num = 0;
                    result = stack.pop() + stack.pop()*result;
                }
            }
        }
        if(num!=0) result += num*sign;
        return result;
    }
}
