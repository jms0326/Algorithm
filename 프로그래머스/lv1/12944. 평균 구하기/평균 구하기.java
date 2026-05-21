class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double a = 0;
        double b = arr.length;
        
        for(int i = 0; i < arr.length; i++) {
            a += arr[i];
        }
        answer = a / b;
        
        return answer;
    }
}