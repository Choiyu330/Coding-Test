import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] score = new int[3];
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i=0; i<answers.length; i++) {
            if(answers[i] == a[i % a.length]) score[0]++;
            if(answers[i] == b[i % b.length]) score[1]++;
            if(answers[i] == c[i % c.length]) score[2]++;
        }
        
        int max = Math.max(score[0], Math.max(score[1], score[2]));
      
        ArrayList<Integer> arr = new ArrayList<>();
        
        if(max == score[0]) arr.add(1);
        if(max == score[1]) arr.add(2);
        if(max == score[2]) arr.add(3);

        int[] answer = new int[arr.size()];
        
        for(int i=0; i<arr.size(); i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}