class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = cipher.split("");
        for (int i=0; i<strArr.length; i++) {
            if ((i+1) % code == 0) {
                sb.append(strArr[i]);
            }
        }
        return sb.toString();
    }
}