class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aa = String.valueOf(a) + String.valueOf(b);
        int bb = Integer.parseInt(aa);
        int cc = a*b*2;
        if(bb>=cc) {
            answer = bb;
        }
        else {
            answer = cc;
        }
        return answer;
    }
}