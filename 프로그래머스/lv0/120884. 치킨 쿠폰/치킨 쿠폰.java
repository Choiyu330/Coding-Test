class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int cp = 0;
        
        while(chicken > 0) {
            answer += chicken / 10 ;
            cp += chicken % 10;
            while(cp > 9) {
                answer += (cp / 10);
                cp += (cp / 10);
                cp %= 10;
            }
            chicken /= 10;
        }
        return answer;
    }
}