class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int k=n; k>1; k=k-1) {
            if(k%2 == 0) {
                
                answer = answer + k;
        }
        
    }
        
        return answer;
    }
}