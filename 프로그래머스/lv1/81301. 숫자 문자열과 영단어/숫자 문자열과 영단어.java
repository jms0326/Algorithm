class Solution {
    public int solution(String s) {
        
        String[] data = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] number = {"0","1","2","3","4","5","6","7","8","9"};
        for(int i = 0; i < data.length; i++) {
            if(s.contains(data[i]) == true) {
                s = s.replaceAll(data[i], number[i]);
            }
        }
    
        return Integer.parseInt(s);
    }
}