class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        
        if( q == 1 && r ==0) {
            return code;
        }else if(r ==0) {
            answer = answer + code.substring(0,1);
            for(int i=1; i<code.length(); i++) {
                if(i % q == r) {
                    answer += code.substring(i,i+1);
                }
            }
        }else {
            for(int i=1; i<code.length(); i++) {
                if( i % q ==r) {
                    answer += code.substring(i,i+1);
                }
            }
        }
        
        
        return answer;
    }
}