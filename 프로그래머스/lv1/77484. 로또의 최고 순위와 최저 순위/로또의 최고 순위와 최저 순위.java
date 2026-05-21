class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int num = 0;
        for(int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0) {
                count++;
            } else {
                for(int j = 0; j < win_nums.length; j++) {
                    if(lottos[i] == win_nums[j]) {
                        num++;
                        break;
                    }
                }
            }
        }
        
        answer[0] = CheckNumber(num + count);
        answer[1] = CheckNumber(num);
        
        return answer;
    }
    
    public int CheckNumber(int data) {
        if(data == 6) {
            return 1;
        } else if (data == 5) {
            return 2;
        } else if (data == 4) {
            return 3;
        } else if (data == 3) {
            return 4;
        } else if (data == 2) {
            return 5;
        } else {
            return 6;
        }
    }
}