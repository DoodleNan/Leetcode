public class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int []>(){
            public int compare(int []p1, int[]p2){
                return p1[1]-p2[1];
            }
        });
        int result = 0;
        if(points.length == 0) return result;
        result++;
        int end = points[0][1];
        for(int i = 1; i<points.length; i++){
            if(points[i][0]>end) {
                result++;
                end = points[i][1];
            }
            
        }
        return result;
    }
}
