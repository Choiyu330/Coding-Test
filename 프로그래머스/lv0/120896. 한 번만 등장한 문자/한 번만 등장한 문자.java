import java.util.*;

class Solution {
    public String solution(String s) {
        String[] str = s.split("");
        
        Arrays.sort(str);
        
        for(int i=0; i<str.length-1; i++) {
            for(int j=i+1; j<str.length; j++) {
                if(str[i].equals(str[j])) {
                    s = s.replaceAll(str[i], "");
                }
            }
        }
        String[] answer = s.split("");
        Arrays.sort(answer);
        
        return String.join("", answer);
    }
}