class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String num = my_string.replaceAll("[^0-9]", "");
        String[] numArr = num.split("");
        int[] intArr = new int[numArr.length];
        
        for(int i=0; i<intArr.length; i++) {
            intArr[i] = Integer.valueOf(numArr[i]);
            answer += intArr[i];
        }
        return answer;
    }
}