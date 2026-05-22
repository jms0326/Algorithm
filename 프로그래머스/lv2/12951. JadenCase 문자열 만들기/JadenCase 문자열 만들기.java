class Solution {
    public String solution(String s) {
        String answer = "";
        // 입력 문자 대문자 -> 소문자로 변경
        String _low = s.toLowerCase();
        String[] _arr = _low.split(" ");
        
        for (int i = 0; i < _arr.length; i++) {
            if (_arr[i].length() == 0) {
                answer += " ";
            }
            
            if (_arr[i].length() > 0) {
                answer += _arr[i].substring(0, 1).toUpperCase();
                answer += _arr[i].substring(1);
                answer +=  " ";
            }
        } 
        
        if(s.substring(s.length()-1, s.length()).equals(" ")){
            return answer;
        }
        
        return answer.substring(0, answer.length()-1);
    }
}