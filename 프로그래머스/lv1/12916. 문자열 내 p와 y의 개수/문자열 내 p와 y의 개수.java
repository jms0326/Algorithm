class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        
        for(int i = 0; i < s.length(); i++) {
            String data = s.substring(i,i+1);
            
            if(data.equals("p") || data.equals("P")) p++;
            if(data.equals("y") || data.equals("Y")) y++;
            
        }
        return p == y ? true : false;
    }
}