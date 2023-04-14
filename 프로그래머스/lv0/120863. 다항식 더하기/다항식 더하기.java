import java.util.*;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x_num = 0;
        int num = 0;
        
        // 공백, + 기호 제거
        String[] str = polynomial.replace(" ", "").split("\\+");
        
        for(int i=0; i<str.length; i++) {
            if(str[i].contains("x")) {
                // x계수가 2이상 일 때
                if(str[i].length() > 1) {
                    x_num += Integer.valueOf(str[i].replace("x", ""));
                }
                else { x_num += 1; }
            }
            else { num += Integer.valueOf(str[i]); }
            
        }
        // x계수가 0일 때
        // x계수가 1일 때
        // 상수가 0일 때
        if(x_num == 0) {
            if(num == 0) { answer = ""; }
            else { answer = "" + num; }
        }
        
        else if(x_num == 1) {
            if(num == 0) { answer = "x"; }
            else { answer = "x + " + num; }
        }
        
        else if(num == 0) {
            answer = x_num + "x";
        }
        
        else {
            answer = x_num + "x + " + num; 
        }
        
        
        return answer;
    }
}