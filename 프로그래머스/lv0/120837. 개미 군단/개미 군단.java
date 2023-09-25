class Solution {
    public int solution(int hp) {
        int answer = 0;
       
        answer = hp/5;
        hp = hp%5;
        
        answer = answer + hp/3;
        hp = hp%3;
        
        if(hp != 0) {
            answer = answer + hp/1;
            
        }
        else {
            
        }
        
        return answer;
    }
}