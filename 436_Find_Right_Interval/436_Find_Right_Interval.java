/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public int[] findRightInterval(Interval[] intervals) {
        int []result = new int[intervals.length];
        TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
        for(int i = 0; i<intervals.length; i++) tm.put(intervals[i].start, i);
        for(Interval i:intervals){
            Map.Entry<Integer, Integer> e = tm.ceilingEntry(i.end);
            result[tm.get(i.start)] = e == null?-1:(int)e.getValue();
        }
        return result;
    }
}
