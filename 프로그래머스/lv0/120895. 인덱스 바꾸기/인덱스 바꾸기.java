import java.util.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String temp = "";
        String[] strArr = my_string.split("");

        temp = strArr[num1];
        strArr[num1] = strArr[num2];
        strArr[num2] = temp;

        return String.join("", strArr);
    }
}