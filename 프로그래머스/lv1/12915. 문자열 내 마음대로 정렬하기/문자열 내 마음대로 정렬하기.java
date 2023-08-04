import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Character[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int cnt = 0;
        
        Arrays.sort(strings);
        
        for(int i=0; i<alphabet.length; i++) {
            for(int j=0; j<strings.length; j++) {
                if(strings[j].charAt(n) == alphabet[i]) {
                    answer[cnt] = strings[j];
                    cnt ++;
                }  
            }
        }
        return answer;
    }
}