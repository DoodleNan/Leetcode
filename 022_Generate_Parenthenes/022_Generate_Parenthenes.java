public class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<String>();
        generate(n,"", n, n, result);
        return result;
    }
    
    public void generate(int n, String prefix, int leftRemaining, int rightRemaining, ArrayList<String> result){
        if(prefix.length() == 2*n){
            result.add(prefix);
        }else{
            if(leftRemaining > 0){
                generate(n, prefix + '(', leftRemaining - 1, rightRemaining, result);
            }
            if(rightRemaining > leftRemaining){
                generate(n, prefix + ')', leftRemaining, rightRemaining - 1, result);
            }
        }
    }
}
