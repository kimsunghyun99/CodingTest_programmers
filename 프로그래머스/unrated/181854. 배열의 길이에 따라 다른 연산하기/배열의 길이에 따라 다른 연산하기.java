class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        if(arr.length % 2 ==1) {
            for(int i=0; i<arr.length; i++) {
               if(i % 2 ==0) {
                   answer[i] = arr[i] + n;
               }
                else{
                    answer[i] = arr[i];
                }
            }
        }
        else  {
            for(int k=0; k<arr.length; k++) {
                if(k % 2 == 1) {
                   answer[k] = arr[k] + n;
               }
                else{
                    answer[k] = arr[k];
                }
            }        
        }
        return answer;
    
}
}