class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String c  = k+ "";
        String str = num + "";
        for(int i=0; i<str.length(); i++) {
            if(str.substring(i,i+1).equals(c) ){
                answer = i+1;
                return answer;
            }
        }
       
        
        return answer;
    }
}