class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];
        
        if(a >= b && a >= c) {
            if(a >= b + c) {
                answer = 2;
            } else {
                answer = 1;
            }
        } else if(b >= a && b >= c) {
            if(b >= a + c) {
                answer = 2;
            } else {
                answer = 1;
            }
        } else if(c >= a && c >= b) {
            if(c >= b + a) {
                answer = 2;
            } else {
                answer = 1;
            }
        }
        
        
        
        return answer;
    }
}