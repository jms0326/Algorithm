class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (int i = 0; i < babbling.length; i++) {
            String _check = babbling[i];
            
            _check  = _check.replace("aya" , "!");
            _check  = _check.replace("ye" , "!");
            _check  = _check.replace("woo" , "!");
            _check  = _check.replace("ma" , "!");
            _check  = _check.replaceAll("!", "");
            
            if(_check.isEmpty()) answer++;
            
            
        }
        return answer;
    }
}