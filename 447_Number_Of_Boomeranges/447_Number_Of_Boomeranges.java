public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int result = 0;
        for(int i = 0; i<points.length; i++){
            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
            for(int j = 0; j<points.length; j++){
                if(i != j){
                    int dis = distance(points[i], points[j]);
                    if(!hm.containsKey(dis)) hm.put(dis, 1);
                    else hm.put(dis, hm.get(dis)+1);
                }
            }
            for(int fre : hm.values()){
                result += fre * (fre-1);
            }
        }
        return result;
    }
    
    private int distance(int[] p1, int[] p2){
        return (p1[0]-p2[0])*(p1[0]-p2[0]) + (p1[1]-p2[1])*(p1[1]-p2[1]);
    }
}
