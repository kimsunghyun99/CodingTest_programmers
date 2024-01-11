import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int k = arr.length;
        
    
        for(int i=0; i<arr.length; i++) {
            list.add(arr[i]);
        }
        
        if(k == 1) {
            answer = new int[1];
            answer[0] = arr[0];
            
            return answer;
        }else{
            for(int t=1; t<=10; t++) {
               if(k > Math.pow(2,t) && k< Math.pow(2,t+1)) {
                   while(list.size() < Math.pow(2,t+1)) {
                       list.add(0);
               }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
           
        }
               }
            
            else if(k == Math.pow(2,t)){
                 return arr;
                   } 
            }
        } 
        return answer;
    }
}