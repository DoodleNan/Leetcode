public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int []>(){
            public int compare(int []p1, int[]p2){
                if(p1[0] != p2[0]) return p2[0] - p1[0];
                else return p1[1] - p2[1];
            }
        });
        ArrayList<int []>arr = new ArrayList<int []>(people.length);
        for(int i = 0; i<people.length; i++){
            arr.add(people[i][1], people[i]);
        }
        int [][]result = new int[people.length][1];
        for(int i = 0; i<people.length; i++){
            result[i] = arr.get(i);
        }
        return result;
    }
}
