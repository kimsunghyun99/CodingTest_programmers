import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        
        for(int i=0; i<intStrs.length; i++) {
           String c = intStrs[i].substring(s,s+l); 
            int t = Integer.parseInt(c);
            System.out.println(t);
            if(t>k) {
                list.add(t);
            }
        }
        
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        
        
        return answer;
    }
}