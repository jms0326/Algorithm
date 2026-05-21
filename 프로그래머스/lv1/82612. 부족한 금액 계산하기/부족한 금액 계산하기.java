class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long data = 0;
        
        for(int i = 1; i <= count; i++) {
           data += price * i;    
        }
        
        if(data <= money) {
            return 0;
        } else {
            return data - money;
        }
    }
}