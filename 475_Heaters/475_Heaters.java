public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int result = 0;
        for(int i = 0; i<houses.length; i++){
            int j = 0;
            while(j+1<heaters.length && Math.abs(houses[i]-heaters[j])>=Math.abs(houses[i]-heaters[j+1])) j++;
            result = Math.max(result, Math.abs(houses[i]-heaters[j]));
        }
        return result;
    }
}
