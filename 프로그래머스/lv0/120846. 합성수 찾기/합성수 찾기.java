class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        for(int i=4; i<=n; i++) {
            for(int k=2; k<i; k++) {
                if(i%k ==0) {
                    cnt++;
                }
            }
            if(cnt >= 1) {
                answer += 1;
                cnt = 0;
            }
        }
        return answer;
    }
}