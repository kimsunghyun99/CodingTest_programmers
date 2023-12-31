import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
        int c = 0;
        for(int i=0; i<commands.length; i++) {
            int[] ans = new int[commands[i][1] - commands[i][0] +1];
            int k=0;
            for(int j =commands[i][0]-1; j<commands[i][1]; j++ ) {
                ans[k] = array[j];
                k++;
            }
            Arrays.sort(ans);
            answer[c] = ans[commands[i][2]-1];
            c++;
        }
        
        return answer;
    }
}