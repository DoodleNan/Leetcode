public class Solution {
    public int nthUglyNumber(int n) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        ArrayList<Integer> l3 = new ArrayList<Integer>();
        l1.add(1);
        l2.add(1);
        l3.add(1);
        int i = 0;
        int j = 0;
        int k = 0;
        int result = 1;
        for(int m = 1; m<=n; m++){
            result = Math.min(Math.min(l1.get(i), l2.get(j)),l3.get(k));
            l1.add(2*result);
            l2.add(3*result);
            l3.add(5*result);
            if(result == l1.get(i)) i++;
            if(result == l2.get(j)) j++;
            if(result == l3.get(k)) k++;
        }
        return result;
    }
}
