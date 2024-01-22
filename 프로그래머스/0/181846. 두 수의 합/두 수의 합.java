import java.math.*;
class Solution {
    public String solution(String a, String b) {
        String answer = "";
       BigInteger  c = new BigInteger(a);
       BigInteger d = new BigInteger(b);
            
       BigInteger result = c.add(d);
       
        answer = String.valueOf(result);
    
       
        return answer;
    }
}