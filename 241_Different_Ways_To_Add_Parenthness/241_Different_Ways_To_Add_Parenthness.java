public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = new ArrayList<Integer>();
        for(int k = 0; k<input.length(); k++){
            char c = input.charAt(k);
            if(!Character.isDigit(c)){
                String left = input.substring(0,k);
                String right = input.substring(k+1);
                List<Integer> l = diffWaysToCompute(left);
                List<Integer> r = diffWaysToCompute(right);
                for(Integer i:l){
                    for(Integer j:r){
                       switch(c){
                            case '+':
                                result.add(i+j);
                                break;
                            case '-':
                                result.add(i-j);
                                break;
                            case '*':
                                result.add(i*j);
                                break;
                       } 
                    }
                }
            }
        }
        if(result.size() == 0) result.add(Integer.parseInt(input));
        return result;
    }
}
