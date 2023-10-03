import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int cnt = 0;
        Arrays.sort(scoville);
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
      
        
        for(int s : scoville) {
            q.offer(s);
        }
        
        
        while(q.peek()<K) {
            if(q.size() < 2) {
                return -1;
            }
        int t =  q.poll();
        int k = q.poll()*2;    
        int hap = t+k;
            q.offer(hap);
            answer++;
            
       
            }
            
        return answer;
    }
}