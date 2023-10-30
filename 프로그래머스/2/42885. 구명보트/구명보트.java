import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        int a = 0;
        int b = people.length -1;
        //578
        // b=2 answer = 1 b=1
        // a=0 b=1 answer = 2 b=0
               while(a<b) {
            if(people[a]+people[b] <= limit) {
                answer++;
                a++;
                b--;
            }
            else {
                answer++;
                b--;
            }
                   if(a == b) {
                       answer++;
                   }
        }
        
    
    
        return answer;
    }
}