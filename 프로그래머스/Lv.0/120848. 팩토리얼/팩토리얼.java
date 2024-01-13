class Solution {
    public int solution(int n) {
        
        
        int answer = 0;
        int k=1;
        int i=1;
       while(k<=n) {
           
           i++;
           k=k*i;
           answer = i;
       }
   
        return answer-1;
    }
}