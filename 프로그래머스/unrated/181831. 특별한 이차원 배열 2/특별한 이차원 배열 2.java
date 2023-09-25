class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        int cnt = 0;
        int k = arr.length;
    for(int i = 0; i<k; i++) {
        for(int j=0; j<k; j++) {
            if(arr[i][j] == arr[j][i] ) {
            cnt += 1;
        }
        }
    }    
        if(cnt == k*k) {
            answer = 1;
        }
        return answer;
    }
}