class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        int[] answer = new int[num2 - num1+1 ];
        int index = 0;
        
        for(int k=num1; k<=num2; k++) {
          answer[index] = numbers[k];
              index = index +1;
            
            }
        return answer;
    }
}