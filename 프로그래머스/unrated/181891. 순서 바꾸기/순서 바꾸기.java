class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int k =0;
        int t = num_list.length - n;
        
        for(int i=n; i<num_list.length; i++ ) {
           answer[k] = num_list[i];
            k++;
        
        }
        
        for(int i=0; i<n; i++) {
            answer[t] = num_list[i];
            t++;
        }
        
        return answer;
    }
}