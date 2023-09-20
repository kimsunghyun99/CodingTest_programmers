class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int ln=strlist.length;
        
        for(int i =0; i<ln; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}