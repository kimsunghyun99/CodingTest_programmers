class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int answer1 = 0;
        int answer2 = 0;
         
        for(int i = 0; i<num_list.length; i=i+2) {
            answer1 = answer1+ num_list[i];
            
        }
        
        
        
        
        for(int i = 1; i<num_list.length; i=i+2) {
            answer2 = answer2+ num_list[i];
        }
        System.out.println(answer2);
        
        
        
        if(answer1 >= answer2) {
            answer = answer1;
        }
        else {
            answer = answer2;
        }
        
        return answer;
    }
}