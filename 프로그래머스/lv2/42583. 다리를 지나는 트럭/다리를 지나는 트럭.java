import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0; 
        Queue<Integer> q = new LinkedList<>();
        int time = 0;
        int sum = 0;
        
        for(int i=0; i<truck_weights.length; i++) {
        
            int truck = truck_weights[i];
            while(true) {
                if(q.isEmpty()) {
                    q.offer(truck); 
                        sum = sum+ truck;
                        time ++;
                        break;
                }
                else if (q.size() == bridge_length) {
                    sum = sum - q.poll();
                    
                } else {
                    if( sum + truck <= weight) {
                        q.offer(truck);
                            sum = sum+truck;
                        time++;
                        break;
                        
                    }
                    else {
                        q.offer(0);
                        time++;
                    }
                }
            }
            
            
        }
        
        
        return time + bridge_length;
    }
}