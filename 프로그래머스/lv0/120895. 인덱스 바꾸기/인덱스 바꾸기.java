class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] c = my_string.toCharArray();
       char k = c[num1];
       char i = c[num2];
        c[num2] = k;
        c[num1] = i;
        
        for(int t = 0; t<c.length; t++) {
           answer = answer + c[t];
        }
        return answer;
    }
}