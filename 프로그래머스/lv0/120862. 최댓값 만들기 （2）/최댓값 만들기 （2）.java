class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = -999999999;
        for(int i=0; i<numbers.length-1; i++) {
           for(int j =i+1; j<numbers.length; j++ ) {
               if(max < numbers[i]*numbers[j]) {
                   max = numbers[i]*numbers[j];
               }
           }
        
            
        }
        return max;
    }
}