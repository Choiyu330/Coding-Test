class Solution {
    public int solution(int[] array) {
        // array의 값을 StringBuilder에 전부 넣고
        // String 배열에 한 개씩 나눠준다
        // 7이면 answer++
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<array.length; i++) {
            sb.append(array[i]);
        }
        
        String[] str = sb.toString().split("");
        
        for(String num : str) {
            if(num.equals("7")) {
                answer++;
            }
        }
        return answer;
    }
}