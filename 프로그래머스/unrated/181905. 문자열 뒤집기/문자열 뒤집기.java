class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String answer1 = my_string.substring(0,s);
        String answer2 = my_string.substring(s,e+1);
        String answer3 = my_string.substring(e+1, my_string.length());
            
        StringBuilder sb = new StringBuilder(answer2);
        sb.reverse();
        answer2 = sb.toString();
          
        
        answer = answer1+answer2+answer3;
        return answer;
    }
}