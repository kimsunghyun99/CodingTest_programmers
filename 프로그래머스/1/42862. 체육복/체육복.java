import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
      ArrayList<Integer> list = new ArrayList<>();
      for (int i = 0; i < n; i++) {
         list.add(1);
      }
      for (int i : reserve) {
         list.set(i - 1, list.get(i-1)+1);
      }
      for (int i : lost) {
         list.set(i - 1, list.get(i-1)-1);
      }
        
        
      for (int i = 0; i < n; i++) {
         if (list.get(i) == 0) {
            if (i >0 && list.get(i-1) == 2) {
               list.set(i, 1);
               list.set(i-1, 1);
            answer++;
                continue;
            }
            if (i < n-1 && list.get(i+1) == 2) {
               list.set(i, 1);
               list.set(i+1, 1);
                answer++;
                continue;
            }
         } else {
             answer++;
         }
        }
     
      return answer;
    }
}