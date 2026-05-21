class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++) {
            String data = array[i] + "";
            
            answer += data.length() - data.replace("7", "").length();
        }
        return answer;
    }
}