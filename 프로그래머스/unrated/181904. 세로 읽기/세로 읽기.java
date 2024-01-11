class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        if(m == 1 && c == 1) {
            answer = my_string;
            return answer;
        }
        
       for(int i=c-1; i<my_string.length(); i=i+m) {
           char k = my_string.charAt(i);
           answer = answer + k;
       }
    
        
        return answer;
    }
}