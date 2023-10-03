import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
    Queue<Integer> q = new LinkedList<>();
    List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<speeds.length; i++) {
            double remain = (100-progresses[i]) / (double)speeds[i];
                int k = (int) Math.ceil(remain);
            
            
            if(!q.isEmpty() && q.peek() < k) {
                list.add(q.size());
                q.clear();
            }
            q.offer(k);
        }
        list.add(q.size());
        int[] a = new int[list.size()];
        for(int i=0; i<a.length; i++) {
            a[i] = list.get(i);
        }
        
        return a;
    }
}