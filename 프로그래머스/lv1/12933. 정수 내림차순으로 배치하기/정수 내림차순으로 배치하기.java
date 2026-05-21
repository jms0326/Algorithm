import java.util.*;

class Solution {
    public long solution(long n) {
        String[] numArr = String.valueOf(n).split();
        
        Arrays.sort(numArr);
        
        StringBuilder answer = new StringBuilder(new String(numArr));
        return Long.parseLong(answer.reverse().toString());
        
    }
}