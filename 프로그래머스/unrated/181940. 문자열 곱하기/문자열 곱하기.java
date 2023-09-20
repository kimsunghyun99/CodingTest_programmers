class Solution {
    public String solution(String my_string, int k) {
        String answer = my_string;
        int i = 1;
        while(i<k) {
            answer = answer+ my_string;
            i++;
        }
        
        return answer;
    }
}