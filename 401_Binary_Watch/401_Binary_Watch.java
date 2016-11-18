public class Solution {
    private int []time = {1,2,4,8,16,32,1,2,4,8};
    
    public List<String> readBinaryWatch(int num) {
        List<String> watch = new ArrayList<String>();
        ArrayList<ArrayList<Integer>> sum = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> prefix = new ArrayList<Integer>();
        compute(sum, prefix, 0, num);
        int hour = 0;
        int min = 0;
        for(ArrayList<Integer> array : sum){
            for(int i : array){
                if(i>=0 && i<=5){
                    min += time[i];
                }else{
                    hour += time[i];
                }
            }
            if(hour <= 11 && min <= 59){
                StringBuilder s = new StringBuilder();
                s.append(hour);
                s.append(":");
                if(min < 10){
                    s.append("0");
                }
                s.append(min);
                watch.add(s.toString());
            }
            hour = 0;
            min = 0;
        }
        
        return watch;
    }
    
    public void compute(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> prefix, int start, int remaining){
        if(remaining == 0){
            result.add(new ArrayList<Integer>(prefix));
        }else if(start >= 10 || remaining < 0){
            return;
        }else{
            ArrayList<Integer> temp = new ArrayList<Integer>(prefix);
            temp.add(start);
            compute(result, temp, start+1,remaining-1);
            compute(result, prefix, start+1, remaining);
        }
    }
}
