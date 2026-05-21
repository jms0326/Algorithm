class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int problemDay = startday;
        int internalDay = (problemDay == 7) ? 0 : problemDay;
        for(int i = 0; i < schedules.length; i++) {
            int count = 0;
            int hour = schedules[i] / 100;
            int minute = schedules[i] % 100 + 10;
            int schedule;
            if(minute >= 60) {
               hour += 1;
               minute -= 60;
            }
            
            schedule = hour * 100 + minute;
            for(int j = 0; j < 7; j++) {
                int actualDayIndex = (internalDay + j) % 7;
                if (actualDayIndex == 0 || actualDayIndex == 6) {
                   continue;
                } 
                
                int actualArrivalTime = timelogs[i][j];
                
                if (actualArrivalTime < 600 || actualArrivalTime > 2359) {
                   continue;   
                }
                
                if(timelogs[i][j] <= schedule) {
                   count++;
                }  
                
            }
            if(count == 5) answer++;
        }
        return answer;
    }
}