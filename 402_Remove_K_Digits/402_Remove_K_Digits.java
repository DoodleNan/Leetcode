public class Solution {
    public String removeKdigits(String num, int k) {
        ArrayList<Character> arr = new ArrayList<Character>(num.length());
        for(char c : num.toCharArray()) arr.add(c);
        int i = 0;
        while(k>0){
            while(i+1<arr.size() && arr.get(i)<=arr.get(i+1)) i++;
            arr.remove(i);
            if(i-1>=0) i--;
            k--;
        }
        i = 0;
        while(i<arr.size() && arr.get(i).equals('0')) i++;
        StringBuilder sb = new StringBuilder();
        for(int index = i; index<arr.size(); index++) sb.append((char)arr.get(index));
        return sb.length() == 0 ?"0":sb.toString();
    }
}
