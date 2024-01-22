import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        int[] k = new int[3];
      
         
        int[] f = new int[3];
        
        for(int i=0; i<attendance.length; i++) {
                if(attendance[i] == true) {  
                    list.add(i);    // 1,2,3,4    ,  // 0,2,5
                }
        }
        
        for(int i=0; i<list.size(); i++) {
            list1.add(rank[list.get(i)]);   // 7,2,5,4   , // 6,5,4 
        }
        Collections.sort(list1);  //  2 , 4, 5 , 7   // 4,5,6
        
        for(int i=0; i<3; i++) {
            k[i] = list1.get(i);
            System.out.println(k[i]);
        }
        
       for(int i=0; i<k.length; i++) {
           for(int j=0; j<rank.length; j++) {
               
               if(k[i] == rank[j]) {
                   f[i] = j;
               }
           }
       }
        
        
        answer = f[0] * 10000 + f[1] * 100 + f[2];
        
        

        
        
        
        return answer;
    }
}