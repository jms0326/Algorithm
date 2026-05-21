class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int lastAttack = attacks[attacks.length-1][0]; 
        int hp = health;
        int count = 0;
        int attackCount = 0;
        
        for(int i = 1; i <= lastAttack; i++) {
            if(i == attacks[attackCount][0]) {
                hp = hp - attacks[attackCount][1];
                    attackCount++;
                    count = 0;
                    if(hp <= 0) {
                        hp = -1;
                        break;
                    }
            } else {                     
                  count++;
                  if(count == bandage[0]) {
                       count = 0;
                       hp = hp + bandage[2] + bandage[1];
                   } else{
                       hp = hp + bandage[1];
                   }
                
                    if(hp > health) {
                        hp = health;
                    }
            }
            
            
        }
        return hp;
    }
}