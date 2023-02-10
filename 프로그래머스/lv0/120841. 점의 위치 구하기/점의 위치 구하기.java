class Solution {
    public int solution(int[] dot) {
        // 제 1사분면은 (+, +)
        // 제 2사분면은 (-, +)
        // 제 3사분면은 (-, -)
        // 제 4사분면은 (+, -)
        int answer = 0;
        
        if(dot[0] > 0 && dot[1] > 0) { answer = 1;}
        else if(dot[0] < 0 && dot[1] > 0) { answer = 2; }
        else if(dot[0] < 0 && dot[1] < 0) { answer = 3; }
        else { answer = 4; }
        
        return answer;
    }
}