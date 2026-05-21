class Solution {
    public String solution(String my_string, int n) {
        
        String answer = "";
        int length = my_string.length();
        
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < n; j++) {
               String _Concat = my_string.substring(i, i+1);
               answer = answer + _Concat; 
            }
        }
        
        
        return answer;
    }
}