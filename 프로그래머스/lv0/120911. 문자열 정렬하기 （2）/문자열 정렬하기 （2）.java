import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        char c[] = my_string.toCharArray();
        Arrays.sort(c);
        for(int i=0; i<c.length; i++) {
            answer = answer + c[i];
        }
        
        
        return answer;
    }
}