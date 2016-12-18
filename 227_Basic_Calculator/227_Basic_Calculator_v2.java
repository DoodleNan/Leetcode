public class Solution {
    public int calculate(String s) {
        int len = s.length();
        Stack<Integer> stack = new Stack<Integer>();
        char sign = '+';
        int num = 0;
        for(int i = 0; i<len; i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                num = num*10+c-'0';
            }
            if(!Character.isDigit(c) && c != ' ' || i == len-1){
                switch(sign){
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop()*num);
                        break;
                    case '/':
                        stack.push(stack.pop()/num);
                        break;
                }
                sign = c;
                num = 0;
            }
            
        }
        int result = 0;
        while(!stack.empty()) result+=stack.pop();
        return result;
    }
}
