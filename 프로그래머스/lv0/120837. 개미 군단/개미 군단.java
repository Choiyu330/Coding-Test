class Solution {
    public int solution(int hp) {
        int answer = 0;
      
        int result1 = hp % 5;
        int result2 = result1 % 3;
        answer = (hp / 5) + (result1 / 3) + result2;
        
        return answer;
    }
}