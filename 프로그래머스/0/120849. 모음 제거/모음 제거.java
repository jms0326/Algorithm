class Solution {
    public String solution(String my_string) {
        String answer = my_string.replaceAll("a","").replaceAll("e","").replaceAll("o","").replaceAll("i","").replaceAll("u","");
        
        return answer;
    }
}