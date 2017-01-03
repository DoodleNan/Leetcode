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
    public int eraseOverlapIntervals(Interval[] intervals) {
        int len = 0;
        Arrays.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval i1, Interval i2){
                return i1.end - i2.end;
            }
        });
        if(intervals.length == 0) return len;
        len++;
        int end = intervals[0].end;
        for(int i = 1; i<intervals.length; i++){
            if(intervals[i].start>=end){
                len++;
                end = intervals[i].end;
            }
        }
        return intervals.length-len;
    }
}
