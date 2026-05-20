class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        // 숫자 제거
        String data = s.replaceAll("[0-9]","");
        
        if(data.length() != 0 || (s.length()!=4 && s.length()!=6)) {
            answer = false;
        }
        
        return answer;
    }
}