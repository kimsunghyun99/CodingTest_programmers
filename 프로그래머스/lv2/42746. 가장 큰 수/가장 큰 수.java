import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];
        
        for(int i =0; i<numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(str, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        if(str[0].equals("0") ) {
            answer = "0";
            return answer;
        }
        
        for(int i=0; i<str.length; i++) {
           answer += str[i];
        }
        
        return answer;
    }
}