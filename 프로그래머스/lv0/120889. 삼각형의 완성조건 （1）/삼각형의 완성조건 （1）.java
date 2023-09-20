class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max=0;
        int g = 0;
        for(int i=0; i<sides.length; i++) {
            if(max < sides[i]) {
                max = sides[i];
            }
            answer =  answer + sides[i];
            
        }
        int j = answer - max*2;
        if(j >0) {
            g = 1;
        }
        else {
            g = 2;
        }

        
        return g;
    }
}