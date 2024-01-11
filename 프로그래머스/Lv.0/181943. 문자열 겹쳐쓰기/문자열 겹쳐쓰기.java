class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
//         int k = overwrite_string.length(); // 7
        
//         String str = my_string.substring(s,s+k);   // 2, 9  // str이 많은경우
    
//         answer =  my_string.replace(str, overwrite_string);
        
        String str = my_string.substring(0,s);
        
        int k = overwrite_string.length();
        
        String str1 = my_string.substring(s+k);
        
        answer = str + overwrite_string + str1;
        
        
        return answer;
    }
}