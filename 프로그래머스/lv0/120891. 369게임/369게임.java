class Solution {
    public int solution(int order) {
        int answer = 0;
        String order_s=Integer.toString(order);
         String arr[]=order_s.split("");
        for(int i = 0; i < arr.length; i++) {
            String _check = arr[i];
            
            if(_check.equals("3") || _check.equals("6") || _check.equals("9")) answer++;

        }
        
        return answer;
    }
}