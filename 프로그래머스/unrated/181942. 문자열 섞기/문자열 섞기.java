class Solution {
    public String solution(String str1, String str2) {
        int k = str1.length();
        String answer = "";
        for(int i=0; i<k; i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
            
        }
        
        
        
        return answer;
    }
}