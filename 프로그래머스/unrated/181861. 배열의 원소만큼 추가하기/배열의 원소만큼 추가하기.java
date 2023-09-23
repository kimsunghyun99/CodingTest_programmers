import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int c=0;
        List<Integer> aa = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
             int k = arr[i];
            for(int j=0; j<k; j++) {
                aa.add(k);
            }
        }
        int[] a = new int[aa.size()];
        for(int k: aa) {
            a[c] = k;
            c++;
        }
        
        return a;
    }
}