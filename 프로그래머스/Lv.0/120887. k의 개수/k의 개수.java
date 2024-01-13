import java.util.*;
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        List<String> list = new ArrayList<String>();
        
   for(int t=i; t<=j; t++) {
       list.add(String.valueOf(t));
   }
        
        for(String str : list) {
           
            
            for(int h=0; h<str.length(); h++) {
                
                if(str.substring(h,h+1).equals(String.valueOf(k))) {
                    answer++;
                }
                
            }
            
            
//             if(str.equals(String.valueOf(k))) {
//                answer = answer + str.length();
//             }
            
//             if(str.contains(String.valueOf(k))) {
//                 answer++;
//             }
        }
        
        
        
        return answer;
    }
}