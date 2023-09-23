import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        
        List<String> aa = new ArrayList<String>();
        
    for(int i=0; i<names.length; i=i+5) {
        aa.add(names[i]); 
       
    }
        String[] answer = new String[aa.size()];
        return aa.toArray(answer);
    }
}