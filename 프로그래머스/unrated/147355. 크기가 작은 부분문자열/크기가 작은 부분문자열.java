class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long num_p = Long.parseLong(p);
        
        // for문으로 글자 잘라서
        // 바로 비교 때리기
        for(int i=0; i<=t.length()-p.length(); i++) {
            long num_t = Long.parseLong(t.substring(i, i + p.length()));
            if(num_p >= num_t)
                answer++;
        }
        return answer;
    }
}