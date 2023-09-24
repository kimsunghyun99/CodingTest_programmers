import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        int gop = 1;
        HashMap<String,Integer> a = new HashMap<>();
        
        for(int i=0; i<clothes.length; i++) {
            String cloth = clothes[i][1];
            a.put(cloth, a.getOrDefault(cloth,0) + 1);
        }
        for(String key : a.keySet()) {
            gop = gop * (a.get(key)+1);
            
        }
        
       answer = gop -1;
        
        
        
        return answer;
    }
}