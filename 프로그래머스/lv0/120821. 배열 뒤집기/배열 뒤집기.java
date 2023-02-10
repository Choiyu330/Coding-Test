class Solution {
    public int[] solution(int[] num_list) {
        // answer[i] 일 때,
        // num_list[answer.length-i]
        int[] answer = new int[num_list.length];
        
        for(int i=1; i<=answer.length; i++) {
            answer[i-1] = num_list[answer.length-i];
        }
        return answer;
    }
}