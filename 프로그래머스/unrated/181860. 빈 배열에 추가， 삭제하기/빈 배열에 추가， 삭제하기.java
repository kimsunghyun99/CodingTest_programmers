import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for(int i =0; i<arr.length; i++) {    // 0부터 4까지
            
            if(flag[i] == true) {                 
            int k = arr[i]*2;               // k = 6
                
                for(int j=0; j<k; j++) {     // 0~  5 번반복
                    list.add(arr[i]);    // list  에 3 6번넣기
                }
                
            }else {
                for(int t=0; t<arr[i]; t++) {       //  t<2 -> 0,1 
                    list.remove(list.size()-1);          
                }
        }
        
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
         answer[i] = list.get(i);
        }
            
        return answer;
    
    }
}