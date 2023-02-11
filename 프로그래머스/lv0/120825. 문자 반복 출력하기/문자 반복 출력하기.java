class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        // 이중 for문 사용하기
        // charAt으로 쪼갠 문자 answer에 n번만큼 넣기
        // my_string.length() 만큼 반복
        for(int i=0; i<my_string.length(); i++) {
            for(int j=0; j<n; j++) {
                answer += my_string.charAt(i); 
            }
        }
        return answer;
    }
}