public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        // Arrays.sort(houses);
        // Arrays.sort(heaters);
        // int result = 0;
        // for(int i = 0; i<houses.length; i++){
        //     int j = 0;
        //     while(j+1<heaters.length && Math.abs(houses[i]-heaters[j])>=Math.abs(houses[i]-heaters[j+1])) j++;
        //     result = Math.max(result, Math.abs(houses[i]-heaters[j]));
        // }
        // return result;
        
        Arrays.sort(heaters);
        int result = 0;
        for(int house:houses){
            int index = Arrays.binarySearch(heaters, house);
            if(index < 0) index = -index-1;
            int dis1 = index == heaters.length? Integer.MAX_VALUE: Math.abs(house-heaters[index]);
            int dis2 = index-1<0? Integer.MAX_VALUE: Math.abs(house-heaters[index-1]);
            result = Math.max(Math.min(dis1, dis2), result);
        }
        return result;
    }
}
