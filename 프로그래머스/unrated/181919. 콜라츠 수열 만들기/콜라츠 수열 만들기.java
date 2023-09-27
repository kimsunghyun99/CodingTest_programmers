import java.util.*;
class Solution {
    public int[] solution(int n) {
        
    int k = 0;
        List<Integer> aa = new ArrayList<>();
        
        if(n == 1) {
            aa.add(1);
           
        }
        
        while(n!=1) { 
        
            aa.add(n);
            if(n%2 ==0) {
                n = n/2;
        }
        else {
            n = n*3 + 1;
           
        }
            
        }
        aa.add(1);
        
        
        int[] answer = new int[aa.size()];
        for(int i=0; i<aa.size(); i++) {
            answer[i] = aa.get(i);
        }
        return answer;
    }
}