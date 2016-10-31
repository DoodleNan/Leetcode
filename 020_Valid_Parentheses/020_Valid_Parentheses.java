public class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<Character>();
        for(char c : s.toCharArray()){
            switch(c){
                case '(':
                    s1.push(c);
                    break;
                case ')':
                    if(s1.empty() || s1.pop() != '(')
                        return false;
                    break;
                case '[':
                    s1.push(c);
                    break;
                case ']':
                    if(s1.empty() || s1.pop() != '[')
                        return false;
                    break;
                case '{':
                    s1.push(c);
                    break;
                case '}':
                    if(s1.empty() || s1.pop() != '{')
                        return false;
                    break;
            }
        }
        if(!s1.empty())
            return false;
        return true;
    }
}
