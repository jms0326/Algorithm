class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int a = i; a <= j; a++) {
            String _a = a + "";
            
            answer += _a.length() - _a.replace((k + ""),"").length();
        }
        
        return answer;
    }
}