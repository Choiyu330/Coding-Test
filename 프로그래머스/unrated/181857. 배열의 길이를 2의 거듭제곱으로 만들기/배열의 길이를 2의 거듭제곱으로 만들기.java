class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        
        int cnt = 0;
        while(len > Math.pow(2, cnt)) {
            cnt++;
        }
        
        int[] answer = new int[(int)Math.pow(2, cnt)];
        for(int i = 0; i < len; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}