class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean x5; 
        boolean x6;
        if(x1 == false && x2 == false) {
            x5 = false;
        }else {
            x5 = true;
        }
        
        if(x3 == false && x4 == false) {
            x6 = false;
        }else {
            x6 = true;
        }
        
        if(x5 == true && x6 == true) {
            answer = true;
        }else {
            answer = false;
        }
        
        
        
        
        
        
        return answer;
    }
}