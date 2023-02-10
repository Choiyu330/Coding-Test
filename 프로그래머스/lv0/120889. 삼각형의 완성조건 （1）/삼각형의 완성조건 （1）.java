class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int longest = 0;
        int sum = 0;
        
        for(int i=0; i<sides.length; i++) {
            // 가장 긴 변 구하기
            if(longest < sides[i] ) { 
                longest = sides[i]; 
            }
            sum += sides[i];
        }
        // 가장 긴 변의 길이 > 다른 두 변의 길이의 합 -> 삼각형 불가능
        if(longest >= sum - longest) { answer = 2; }
        else { answer = 1; }
        
        return answer;
    }
}