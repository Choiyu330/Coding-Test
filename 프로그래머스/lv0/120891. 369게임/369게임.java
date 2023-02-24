import java.util.*;

class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = Integer.toString(order);
        String[] strOrder = str.split("");

        for(int i=0; i<strOrder.length; i++) {
            if(strOrder[i].equals("3") || strOrder[i].equals("6") || strOrder[i].equals("9")) {
                answer++;
            }
        }
        return answer;
    }
}