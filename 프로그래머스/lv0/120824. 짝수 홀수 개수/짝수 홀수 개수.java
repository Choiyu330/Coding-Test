class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        for(int i=0; i<num_list.length; i++) {
            // 짝수일 경우
            if(num_list[i] % 2 == 0) { answer[0]++; }
            // 홀수일 경우
            else { answer[1]++; }
        }
        return answer;
    }
}