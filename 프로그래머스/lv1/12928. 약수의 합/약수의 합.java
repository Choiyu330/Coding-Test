class Solution {
    public int solution(int n) {
        int answer = 0;
        int sqrt = (int)Math.sqrt(n);

        for(int i=1; i<=sqrt; i++) {
            // 약수 중 작은 수 구하기
            // ex) 10의 약수 2,5 중 2
            if(n % i == 0) {
                answer += i;
                // 약수 중복 방지
                if(n / i != i) { 
                    // 약수 중 큰 수 구하기
                    // ex) 10의 약수 2,5 중 5
                    answer += n / i;
                }
            }
        }
        return answer;
    }
}