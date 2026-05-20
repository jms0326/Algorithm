class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String data = my_string.replaceAll("[^0-9]","");
        
        for (int i = 0; i < data.length(); i++) {
            // 각 문자 하나를 숫자로 변환해서 더하기
            answer += data.charAt(i) - '0';
        }
        
        return answer;
    }
}