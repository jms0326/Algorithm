class Solution {
    public int solution(int num) {
        int answer = 0;
        int number = num;
        for(int i = 0; i < 501; i++) {
            if(number == 1) {
                break;
            }
            if(number % 2 == 0) {
                number = number / 2;
            } else if (number % 2 == 1) {
                number = number * 3 + 1;
            }
                answer++;
            if( i == 500) {
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}