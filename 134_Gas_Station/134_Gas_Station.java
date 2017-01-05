public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int result = 0;
        int tank = 0;
        int g = 0;
        int c = 0;
        for(int i :gas) g+=i;
        for(int i :cost) c+=i;
        if(g<c) return -1;
        for(int i = 0; i<gas.length; i++){
            if(tank+gas[i]-cost[i]<0){
                result = i+1;
                tank = 0;
            }else tank += gas[i]-cost[i];
            if(result == gas.length && i == gas.length-1) return -1;
        }
        return result;
    }
}
