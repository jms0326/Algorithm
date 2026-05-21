class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int add = 0;
        int ppp = 1;
        
        for(int i = 0; i < num_list.length; i++) {
           ppp = ppp * num_list[i];
           add += num_list[i];
        }
           if((add * add) > ppp) answer = 1;
        
        return answer;
    }
}