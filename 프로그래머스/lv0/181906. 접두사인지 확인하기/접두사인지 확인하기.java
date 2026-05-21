class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        for(int i = 0; i < my_string.length(); i++) {
            String _data = my_string.substring(0,i+1);
            if(_data.equals(is_prefix)) {
                answer++;
            }
            
            
        }
        
        
        return answer;
    }
}