class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int i;
        int j;
        int k;
        int max=0;
        
        for(i=0; i<numbers.length; i++) {
            for (j=i+1; j<numbers.length; j++) {
               if(numbers[i]*numbers[j]>max) {
                   max = numbers[i]*numbers[j];
               }
                }
            }
        
        return max;
    }
}