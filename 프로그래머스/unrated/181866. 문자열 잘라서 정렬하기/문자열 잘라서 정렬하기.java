import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        return Arrays.stream(answer).sorted().filter(i -> !i.equals("")).toArray(String[]::new);
    }
}