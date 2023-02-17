class Solution {
    public String solution(String rsp) {
        char[] charArr = rsp.toCharArray();

        for(int i=0; i< charArr.length; i++) {
            if(charArr[i] == '2') {
                charArr[i] = '0';
            }
            else if(charArr[i] == '0') {
                charArr[i] = '5';
            }
            else {
                charArr[i] = '2';
            }
        }
        return String.valueOf(charArr);
    }
}