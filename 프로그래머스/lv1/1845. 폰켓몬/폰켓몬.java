import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int k = nums.length / 2;
        int answer = 0;
            HashSet<Integer> set = new HashSet<>();
            for(int num : nums) {
                set.add(num);
            }
        if( set.size() > k) {
            answer = k;
        }
        else {
            answer = set.size();
        }
        
        
        return answer;
    }
}