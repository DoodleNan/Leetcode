public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char []sarr = s.toCharArray();
        char []tarr = t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        String s1 = new String(sarr);
        String t1 = new String(tarr);
        return s1.indexOf(t1) == 0;
    }
}
