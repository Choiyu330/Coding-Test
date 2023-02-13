class Solution {
    public int solution(int n) {
        int answer = 0;
        String number = Integer.toString(n);
        String[] arr = number.split("");
        
        for(int i=0; i<arr.length; i++) {
            answer += Integer.valueOf(arr[i]);
        }
        return answer;
    }
}