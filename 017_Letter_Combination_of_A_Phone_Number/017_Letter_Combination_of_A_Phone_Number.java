public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        char[][] map = {" ".toCharArray(), "".toCharArray(),   
                        "abc".toCharArray(), "def".toCharArray(), "ghi".toCharArray(),   
                        "jkl".toCharArray(), "mno".toCharArray(), "pqrs".toCharArray(),   
                        "tuv".toCharArray(), "wxyz".toCharArray()};
        if(digits.length() == 0 || digits == null) return result;
        compute(result, "", 0, digits,map);
        return result;
    }
    
    public void compute(List<String> result, String prefix, int index, String digits, char[][]map){
        if(index >= digits.length()) result.add(new String(prefix));
        else{
            int i = (int)(digits.charAt(index) - '0');
            char []array = map[i];
            for(int j = 0; j<array.length;j++){
                compute(result, prefix+array[j],index+1, digits, map);
            }
        }
    }
}
