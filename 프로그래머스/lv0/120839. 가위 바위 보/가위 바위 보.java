class Solution {
    public String solution(String rsp) {
        
        rsp = rsp.replaceAll("2","a").replaceAll("0","b").replaceAll("5","c");
        
        
        return rsp.replaceAll("a","0").replaceAll("b","5").replaceAll("c","2");
    }
}