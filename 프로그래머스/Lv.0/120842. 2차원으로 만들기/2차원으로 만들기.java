class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
        int i = 0;
        int k = num_list.length / n;
        answer = new int[k][n];
        int f=0;
       while(f<num_list.length) {
            for(int c=0; c<k; c++) {
            for(int t=0; t<n; t++) {
                answer[c][t] = num_list[f];
                    f++;
            }
            }
    }
       
        
        
        return answer;
    }
}