class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0;
        int min_max = 0;
        int k = 0; 
        for(int i=0; i<sizes.length; i++) {
          if(sizes[i][0] < sizes[i][1] ) {
              k = sizes[i][1];
              sizes[i][1] = sizes[i][0];
              sizes[i][0] =k;
    
          }

        }
        
        
        for(int i=0; i<sizes.length; i++) {
            if(max <= sizes[i][0] ) {
                max = sizes[i][0];
            }
        }
        for(int i=0; i<sizes.length; i++) {
            if(min_max <= sizes[i][1] ) {
                min_max = sizes[i][1];
            }
        }
        answer = max * min_max; 

    
        return answer;
    }
}