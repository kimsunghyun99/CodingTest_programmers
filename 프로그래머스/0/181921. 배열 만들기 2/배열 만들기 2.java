import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        int cnt = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=l; i<=r; i++){   
            if(i%5 == 0){
            for(int j=0; j<String.valueOf(i).length(); j++) {
            if(String.valueOf(i).charAt(j) == '5' || String.valueOf(i).charAt(j) == '0' ) {
               cnt++;
            }
            if(cnt == String.valueOf(i).length()) {
                list.add(i);
            }
                
                }
                
            }
             cnt = 0;
                }
            answer = new int[list.size()];
            for(int i=0; i<list.size(); i++) {
                answer[i] = list.get(i);
            }
        
        if(list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
       
    
        return answer;
    }
}