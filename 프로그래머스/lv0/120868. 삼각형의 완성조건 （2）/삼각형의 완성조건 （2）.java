class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        
        System.out.println(max);
        
        // 가장 긴 변이 max 인 경우
        for(int i=0; i<=max; i++) {
            if(min + i > max) {
                answer++;
            }
        }
        
        // 나머지 한 변이 가장 긴 변인 경우
        for(int i=max+1; i<max+min; i++) {
            answer++;
        }
        return answer;
    }
}