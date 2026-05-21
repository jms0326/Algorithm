class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int a = n / 2;
        
        for(int i = 1; i <= a; i++) {
        answer += 2 * i;
        }
        
        return answer;
    }
}