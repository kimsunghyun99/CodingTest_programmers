class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
       String a = myString.replace('A', 'X').replace('B', 'A').replace('X', 'B');
        
        
        if( a.contains(pat)) {
            answer = 1;
        }
        else {
            answer = 0;
        }
        return answer;
      
     
    }
}