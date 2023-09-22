import java.util.ArrayList;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
       
        ArrayList<String> answer = new ArrayList<>();
        int k =0;
        
        
        for(int i =0; i<finished.length; i++) {
            if(finished[i] == false) {
                answer.add(todo_list[i]);
                
            }
        }
        String[] a = new String[answer.size()];
        for(String temp : answer) {
            a[k] = temp;
            k++;
        }
        
        return a;
    }
}