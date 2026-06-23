import java.util.*;

class Solution {
    boolean solution(String s) {
          Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++) {
            char data = s.charAt(i);
            if(data == '(') {
                stack.push('(');
            } else if(stack.isEmpty()) {
                return false;
            } else if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
            }
        return stack.isEmpty();
    }
}

