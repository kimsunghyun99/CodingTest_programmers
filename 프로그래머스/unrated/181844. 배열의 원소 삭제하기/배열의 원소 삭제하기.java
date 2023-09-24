import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : delete_list) {
            set.add(num);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int k : arr) { 
            if(!set.contains(k)) {
                list.add(k);
            }
        }
       
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}