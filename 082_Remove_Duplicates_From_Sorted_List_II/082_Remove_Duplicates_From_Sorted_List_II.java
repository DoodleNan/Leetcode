/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        HashMap<Integer, ListNode> hm = new HashMap<Integer, ListNode>();
        ArrayList<ListNode> arr = new ArrayList<ListNode>();
        ListNode current = head;
        boolean reverse = false;
        do{
            current = current.next;
        }while(current != null && current.val == head.val);
       
       if(current == null) return null;
       if(current.val < head.val) reverse = true;
       current = head;
        while(current != null){
            if(!hm.containsKey(current.val)){
                hm.put(current.val, current);
            }else{
                hm.put(current.val, null);
            }
            current = current.next;
        }
        for(Map.Entry e : hm.entrySet()){
            if(e.getValue() != null){
               arr.add((ListNode)e.getValue()); 
            }
        }
        if(reverse){
            Collections.sort(arr, new Comparator<ListNode>(){
                public int compare(ListNode l1, ListNode l2){
                    if(l1.val > l2.val) return -1;
                    if(l1.val < l2.val) return 1;
                    else return 0;
                }
            });
        }else{
            Collections.sort(arr, new Comparator<ListNode>(){
                public int compare(ListNode l1, ListNode l2){
                    if(l1.val > l2.val) return 1;
                    if(l1.val < l2.val) return -1;
                    else return 0;
                }
            });
        }
        for(int i = 0; i<arr.size(); i++){
            if(i == arr.size()-1){
                arr.get(i).next = null;
            }else{
                arr.get(i).next = arr.get(i+1);
            }
        }
        if(arr.size() == 0) return null;
        else return arr.get(0);
    }
}
