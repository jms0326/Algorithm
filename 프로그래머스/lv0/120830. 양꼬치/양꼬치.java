class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int first = n * 12000;
        int second = k * 2000;
        int third = (n / 10) * 2000;
        
        answer = first + second - third;
        return answer;
    }
}