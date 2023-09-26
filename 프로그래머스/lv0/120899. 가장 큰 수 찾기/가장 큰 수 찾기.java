class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int k = 0;
        int c = 0;
        if(array.length >=2) {
            k = Math.max(array[0],array[1]);
        }
        
        for(int i=2; i<array.length; i++) {
          k =  Math.max(k,array[i]);
        }
        for(int i=0; i<array.length; i++) {
            if(array[i] == k) {
                c = i;
            }
        }
        
        answer[0] = k;
        answer[1] = c;
        
        return answer;
    }
}