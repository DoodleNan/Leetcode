public class Solution {
    public int calculate(String s) {
        int len = s.length();
        Stack<Integer> stack = new Stack<Integer>();
        int index = 0;
        while(index<len){
            char c = s.charAt(index);
            if(c == ' '){
                index++;
            }else if(Character.isDigit(c)){
                ArrayList<Character> arr = new ArrayList<Character>();
                while(index<len && Character.isDigit(s.charAt(index))){
                    arr.add(s.charAt(index++));
                    //index++;
                }
                int sum = 0;
                for(int i = 0; i<arr.size(); i++){
                    sum += (int)(arr.get(i)-'0')*Math.pow(10, arr.size()-i-1);
                }
                stack.push(sum);
            }else{
                index++;
                while(s.charAt(index) == ' ') index++;
                ArrayList<Character> arr = new ArrayList<Character>();
                int sum = 0;
                while(index<len && Character.isDigit(s.charAt(index))){
                    arr.add(s.charAt(index++));
                }
                for(int i = 0; i<arr.size(); i++){
                    sum += (int)(arr.get(i)-'0')*Math.pow(10,arr.size()-i-1);
                }
                switch(c){
                    case '+':
                        stack.push(sum);break;
                    case '-':
                        stack.push(-sum);break;
                    case '*':
                        stack.push(stack.pop()*sum);break;
                    case '/':
                        stack.push(stack.pop()/sum);break;   
                }
            }
        }
        int result = 0;
        while(!stack.empty()) result+=stack.pop();
        return result;
    }
}
