public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int result = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                i++;
                j++;
                result++;
            }else{
                j++;
            }
        }
        return result;
    }
}
