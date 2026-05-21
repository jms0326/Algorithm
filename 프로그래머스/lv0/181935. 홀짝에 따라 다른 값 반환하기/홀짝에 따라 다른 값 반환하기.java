class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n % 2 == 0) {
            for(int i = 1; i <= n; i++) {
                if(i % 2 == 0) {
                    answer = answer + (i * i);
                }
            }
        } else {
             for(int i = 1; i <= n; i++) {
                if(i % 2 == 1) {
                    answer = answer + i;
                }
            }
        }
        
        return answer;
    }
}