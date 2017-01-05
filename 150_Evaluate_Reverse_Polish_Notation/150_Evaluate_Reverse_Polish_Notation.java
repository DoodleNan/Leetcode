public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for(String str : tokens){
            if(str.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else if(str.equals("-")){
                stack.push(-(stack.pop()-stack.pop()));
            }else if(str.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else if(str.equals("/")){
                int x = stack.pop();
                int y = stack.pop();
                stack.push(y/x);
            }else{
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }
}
