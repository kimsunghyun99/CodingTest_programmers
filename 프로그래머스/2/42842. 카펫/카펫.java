class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int hap = brown + yellow;
        int k = 0;
        int p = 0;
        
        for(int i=3; i<=hap; i++) {
            if(hap % i == 0) {
                k = hap / i;
                p = i;
            }
            if((k-2)* (p-2) == yellow && k >= p){
                answer[0] = k;
                answer[1] = p;
            }
            
            
            
        }
        
        
        
        return answer;
    }
}