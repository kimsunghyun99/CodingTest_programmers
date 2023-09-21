class Solution {
    public int[] solution(int n, int k) {
        int cnt = n/k;
        int[] answer = new int[cnt];
        int c =0;
        for(int i=1; i<=n; i++) {
            if(i%k == 0) {
            answer[c] = i;
                c++;
        }
         
        }
        
        return answer;
    }
}