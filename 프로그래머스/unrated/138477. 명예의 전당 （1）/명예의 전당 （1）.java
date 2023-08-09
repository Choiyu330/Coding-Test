import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] rank = new int[score.length];
        
        for(int i=0; i<score.length; i++) {
            rank[0] = score[i];
            Arrays.sort(rank);
            if(i < k)
                answer[i] = rank[score.length - 1 - i];
            else
                answer[i] = rank[score.length - k];
        }
        return answer;
    }
}