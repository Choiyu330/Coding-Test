import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        String[] engAge = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        ArrayList<Integer> arrAge = new ArrayList<>();
        
        if(age == 1000) { return "baaa"; }
        if(age == 100) { return "baa"; }
        if(age == 10) { return "ba"; }
        // 101 - 999
        else if(age > 100 && age <= 999) {
            // ex) 800
            arrAge.add(age / 100);
            arrAge.add((age % 100) / 10); 
            arrAge.add((age % 100) % 10);
            for(int i=0; i<arrAge.size(); i++) {
                for(int j=0; j<engAge.length; j++) {
                    if(arrAge.get(i) == j) {
                        answer += engAge[j];
                    }
                }
            }
        }
        // 11 - 99
        else if(age > 10 && age <= 99) {
            arrAge.add(age / 10);
            arrAge.add(age % 10);
            for(int i=0; i<arrAge.size(); i++) {
                for(int j=0; j<engAge.length; j++) {
                    if(arrAge.get(i) == j) {
                        answer += engAge[j];
                    }
                }
            }
        }
        // 0 - 9
        else {
            for(int i=0; i<engAge.length; i++) {
                if(i == age) {
                    answer = engAge[i];
                    break;
                }
            }
        }
        return answer;
    }
}