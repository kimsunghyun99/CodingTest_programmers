class Solution {
    public int[] solution(int[] prices) {
       int k = prices.length;
        int c = 0;
        int[] answer = new int[k];
       for(int i=0; i<k-1; i++) {
           for(int j=i+1; j<k; j++) {
           if(prices[i] > prices[j] ) {
               answer[c] += 1;
               break;
           }
               else {
                   answer[c] += 1;
               }
               
              }
           c++;
       }
       
        
        
        return answer;
    }
}