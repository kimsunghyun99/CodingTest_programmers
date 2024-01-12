import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int cnt = 0;
       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
 
        for(int i=0; i<strArr.length; i++) {
            int k = strArr[i].length();
            if(!map.containsKey(k)) {
                cnt = 1;
                map.put(k, cnt);
            }else{
                map.put(k,map.get(k)+1);   
            }
        }
        
        int max = 0;
        for(int i=0; i<strArr.length; i++) {
             int k = strArr[i].length();
            
            if(max <= map.get(k) ) {
                max = map.get(k);
            }
        }
        return max;
    }
}