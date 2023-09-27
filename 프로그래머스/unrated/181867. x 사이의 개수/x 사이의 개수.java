import java.util.*;
class Solution {
    public int[] solution(String myString) {
        
        List<Integer> aa = new ArrayList<>();
        int cnt = 0;
        String[] a = myString.split("x",myString.length());
        for(int i=0; i<a.length; i++) {
            
         int k = a[i].length();
            aa.add(k);
           
            
           }
        int[] answer =new int[aa.size()];
        for(int i=0; i<aa.size(); i++) {
            
            answer[i] = aa.get(i);
        }
        
       
        return answer;
    }
}