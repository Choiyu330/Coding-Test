import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        String[] str = new String[my_string.length()];
        my_string = my_string.toLowerCase();
        
        for(int i=0; i<my_string.length(); i++) {
            str[i] = String.valueOf(my_string.charAt(i));
        }
        Arrays.sort(str);

        return Arrays.stream(str).collect(Collectors.joining());
    }
}