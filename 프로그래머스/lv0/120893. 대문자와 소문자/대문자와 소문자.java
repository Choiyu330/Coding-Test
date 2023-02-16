class Solution {
    public String solution(String my_string) {

        char[] charArr = my_string.toCharArray();

        for(int i=0; i<charArr.length; i++) {
            if(Character.isUpperCase(charArr[i])) {
                charArr[i] = Character.toLowerCase(charArr[i]);
            }
            else {
                charArr[i] = Character.toUpperCase(charArr[i]);
            }
        }
        return String.valueOf(charArr);
    }
}