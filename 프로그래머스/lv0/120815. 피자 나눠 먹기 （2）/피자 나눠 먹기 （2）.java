class Solution {
    public int solution(int n) {
        int answer = 0;
        int i=1;
        if(n%6 ==0 ) {
            answer = n/6;
        }
        else { 
            while(i<=100) {
        if((n*i) % 6 == 0 ) {
          answer = (n*i) / 6;
            return answer;
        }
            i++;
        }
        }
        
        return answer;
    }
}