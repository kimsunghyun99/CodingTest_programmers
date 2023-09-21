class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
      
        for(int i = 0; i<strArr.length; i=i+2) {
           answer[i] = strArr[i].toLowerCase();  
            
        }
        for( int k= 1; k<strArr.length; k=k+2) {
            answer[k] = strArr[k].toUpperCase();
        }
        return answer;
    }
}