class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String start = s.substring(0,1);
        
        if (start.equals("-")) {
            answer = 0 - Integer.parseInt(s.substring(1,s.length()));;
        } else {
            answer = Integer.parseInt(s.substring(0,s.length()));;
        }
        
        return answer;
    }
}