class Solution {
    public int solution(int n) {
        int answer = 1;
        int data = n / 7;
        if(n % 7 == 0) {
            return data;
        } else {
            return data + answer;
        }
        
    }
}