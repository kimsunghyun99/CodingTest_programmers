class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
       
        int m = myString.length();
        int n = pat.length();
        
    int  cnt = 0;
        
        for(int i=0; i<m-n+1; i++) {
           if(myString.substring(i,i+n).equals(pat)) {
               cnt +=1;
           }
        }
        
        
        
        
        return cnt;
    }
}