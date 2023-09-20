import java.util.ArrayList;   

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> array = new ArrayList<Integer>();    

        for (int i = 1; i < nums.length; i++) {       
            if (!array.contains(nums[i])) {                       // array 에 nums[i] 값이 없다면 
                array.add(nums[i]);                                  // 값 추가
            }
        }

        answer = array.size();                                     // array의 크기를 answer에 넣음

        if (answer > nums.length / 2) {                        // array의 크기가 최대로 뽑을 수 있는 N/2 보다 크다면
            answer = nums.length / 2;                          // answer을 최대값인 N/2로 정의   
        }

        return answer;
    }
}
