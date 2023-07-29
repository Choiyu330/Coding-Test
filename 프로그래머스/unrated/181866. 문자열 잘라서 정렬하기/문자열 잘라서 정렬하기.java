import java.util.*;

class Solution {
    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x")).sorted().filter(i -> !i.equals("")).toArray(String[]::new);
    }
}