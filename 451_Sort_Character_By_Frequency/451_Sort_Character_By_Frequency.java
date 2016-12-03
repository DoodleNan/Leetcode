import java.util.*;
public class Solution {
    public String frequencySort(String s) {
        if(s.length() == 0 || s == null) return "";
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(char c:s.toCharArray()){
            if(hm.containsKey(c)) hm.replace(c, hm.get(c)+1);
            else hm.put(c,1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(hm.size(), new Comparator<Map.Entry<Character, Integer>>(){
                //@override
                public int compare(Map.Entry<Character, Integer> e1, Map.Entry<Character, Integer> e2){
                    return (int)(e2.getValue() - e1.getValue());
                }
            });
        for(Map.Entry e:hm.entrySet()) pq.offer(e);
        int size = pq.size();
        for(int i = 0; i<size; i++){
            char c = pq.peek().getKey();
            int fre = pq.poll().getValue();
            while(fre>0){
                sb.append(c);
                fre--;
            }
        }
        return sb.toString();
    }
}
