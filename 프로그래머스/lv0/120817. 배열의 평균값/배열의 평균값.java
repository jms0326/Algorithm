class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
        int a = 0;
        
        for(int i = 0; i < numbers.length; i++) {
            a += numbers[i];
        }
        
        // answers = a / numbers.length;
        return (double) a / numbers.length;
    }
}