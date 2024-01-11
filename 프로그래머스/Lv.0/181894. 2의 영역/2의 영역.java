import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        
        
        
        for(int i=0; i<arr.length; i++) {
            
            if(arr[i] == 2) {
                list.add(i);
            }
        }
        if(list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        
        if(list.size() == 1) {
            answer = new int[1];
            answer[0] = 2;
            return answer;
            
        }else{
         for(int i=list.get(0); i<=list.get(list.size()-1); i++) {
             list1.add(arr[i]);
         }
        }
        answer = new int[list1.size()];
            for(int i=0; i<answer.length; i++) {
            answer[i] = list1.get(i);}
            
            
            
        
        
        
        
        return answer;
    }
}