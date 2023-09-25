import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> a = new ArrayList<>();
        
        int k =0;
        for(int i=0; i<numlist.length; i++) {
            if(numlist[i] % n ==0) {
                a.add(numlist[i]);
                
            }
        }
            int[] answer = new int[a.size()];
                for(int i =0; i<a.size(); i++) {
                    answer[i] = a.get(i);
                }
            
        
        return answer;
    }
}