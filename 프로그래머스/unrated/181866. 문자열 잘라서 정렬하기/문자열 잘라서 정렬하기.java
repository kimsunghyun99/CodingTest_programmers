import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer1 = myString.split("x");
        ArrayList<String> list = new ArrayList<>();
        
        for(String a : answer1) {
            if(!a.isEmpty()) {
                list.add(a);
            }
        }
        
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}