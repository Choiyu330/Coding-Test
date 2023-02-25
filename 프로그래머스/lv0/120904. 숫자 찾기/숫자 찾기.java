class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = Integer.toString(num);

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == (char)(k + '0')) {
                answer = i+1;
                break;
            }
            answer = -1;
        }
        return answer;
    }
}