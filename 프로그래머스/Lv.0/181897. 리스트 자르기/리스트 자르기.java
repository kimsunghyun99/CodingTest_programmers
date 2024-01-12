class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        
        int t = slicer[1]-slicer[0];
        
        if(n == 1) {
            answer = new int[slicer[1]+1];
            for(int i=0; i<answer.length; i++) {
                answer[i] = num_list[i];
            }
        }else if(n==2){
            answer = new int[num_list.length-slicer[0]];
            for(int i=0; i<answer.length; i++) {
                answer[i] = num_list[slicer[0]+i];
            }
        }else if(n==3){
            answer = new int[t+1];
            for(int i=0; i<answer.length; i++){
                answer[i] = num_list[slicer[0]+i];
            }
        }else if(n==4){
            int size = (t/slicer[2])+1;
            answer = new int[size];
            int k=0;
                    for(int i=0; i<=size; i++){
                        if(slicer[0] + i * slicer[2] <= slicer[1]){
                        answer[k] = num_list[slicer[0] + i * slicer[2]];
                        
                        k++;
                        }
                    }
        }
        
        
        return answer;
    }
}