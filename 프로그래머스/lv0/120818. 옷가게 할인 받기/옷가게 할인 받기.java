class Solution {
    public int solution(int price) {
        int answer = 0;
        if(price < 100000) {
            answer = (int)price;
            System.out.println(answer);
        }
        else if(price < 300000) {
            answer = (int)(price * 0.95);
            System.out.println(answer);
        }
        else if (price < 500000) {
            answer = (int)(price * 0.9);
            System.out.println(answer);
        }
        else {
            answer = (int)(price * 0.8);
            System.out.println(answer);
        }
        
        return answer;
    }
}