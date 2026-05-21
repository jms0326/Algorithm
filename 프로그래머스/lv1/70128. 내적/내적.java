class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int c = 0;
        for(int i = 0; i < a.length; i++) {
            c = a[i] * b[i];
            answer = answer + c;
        }
        
        return answer;
    }
}