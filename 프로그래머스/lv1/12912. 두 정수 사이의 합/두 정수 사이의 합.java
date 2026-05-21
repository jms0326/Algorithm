class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int c = 0;
        
        if(a == b) {
            c = a;
        } else {
            c = (a + b) / 2;
        }
        
        return a + b + c;
    }
}