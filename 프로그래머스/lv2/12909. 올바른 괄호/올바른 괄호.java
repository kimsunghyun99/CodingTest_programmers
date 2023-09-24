class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int a = 0;

        // 문자열을 문자 배열로 변환
        char[] chars = s.toCharArray();

        // 괄호 짝 검사
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                a += 1;
            } else if (chars[i] == ')') {
                a -= 1;
            }

            // 괄호 짝이 맞지 않으면 false 반환
            if (a < 0) {
                answer = false;
                break;
            }
        }

        // 모든 괄호 짝이 맞고, 첫 문자가 '('이며, 마지막 문자가 ')'인 경우에만 true 반환
        if (a != 0 || chars[0] != '(' || chars[chars.length - 1] != ')') {
            answer = false;
        }

        return answer;
    }
}