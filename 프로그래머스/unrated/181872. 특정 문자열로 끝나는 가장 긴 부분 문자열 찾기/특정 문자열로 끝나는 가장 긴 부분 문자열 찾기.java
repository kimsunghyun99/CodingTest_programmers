class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
       int k = myString.lastIndexOf(pat);
     answer = myString.substring(0,k+pat.length());
        
        
        
        return answer;
    }
}