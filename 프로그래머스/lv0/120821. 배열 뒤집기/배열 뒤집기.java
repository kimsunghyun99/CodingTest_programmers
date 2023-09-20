class Solution {
    public int[] solution(int[] num_list) {
        
        int ln = num_list.length;
        int index = 0;
        
        int[] answer = new int[ln];
        for(int k=ln-1; k>=0; k--) {
            answer[index] = num_list[k];
            index = index+1;
        }
        
        return answer;
    }
}