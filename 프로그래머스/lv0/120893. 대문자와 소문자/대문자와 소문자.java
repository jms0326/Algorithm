class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        System.out.print(Character.isUpperCase('a'));
        
        String[] _arr = my_string.split("");
        for(String i : _arr) {
            if(Character.isUpperCase(i.charAt(0)) == true) {
                answer += i.toLowerCase();
            } else {
                answer += i.toUpperCase();
            }
        }
        
        
        return answer;
    }
}