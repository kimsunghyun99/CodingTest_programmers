import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
      
        char c[] = before.toCharArray();
        char d[] = after.toCharArray();
        
    Arrays.sort(c);
    Arrays.sort(d);
        
       int a = Arrays.equals(c,d)? 1:0;
        
       
        
        
        
        return a;
    }
}