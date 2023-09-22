class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aa = Integer.toString(a);
        String bb = Integer.toString(b);
        String c = aa+bb;
        String d = bb+aa;
        int e = Integer.parseInt(c);
        int f = Integer.parseInt(d);  
        
        if(e>f) {
            answer = e;
        }
        else if(e<f) {
            answer = f;
        }
        else if (e==f) {
            answer = e;
        }
        
       
        
        
        return answer;
    }
}