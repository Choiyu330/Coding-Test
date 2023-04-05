import java.util.*;
class Solution {
    public int solution(int[][] dots) {
    
        int width = dots[0][0];
        int height = dots[0][1];
        
        for(int i=1; i<dots.length; i++) {
            if(dots[i][0] == dots[0][0]) {
                height = Math.abs(dots[i][1] - height);
            }
            
            if(dots[i][1] == dots[0][1]) {
                width = Math.abs(dots[i][0] - width);
            }
        }
        return width * height;
    }
}