import java.util.*;

class Solution {
    private static List<int[]> list;
    
    public static int[][] solution(int n) {
        
        list = new ArrayList<>();
        dfs(n, 1, 3, 2);
        
        int[][] answer = new int[list.size()][];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
    // n개 중 n-1을 2번째로 옮긴다
    // n을 3번째로 옮긴다
    // n-1을 3번째로 옮긴다
    private static void dfs(int n, int start, int end, int mid) {
        if(n == 1) {
            list.add(new int[]{start, end});
            return;
        }
        dfs(n-1, start, mid, end);
        
        list.add(new int[]{start, end});
        
        dfs(n-1, mid, end, start);
            
    }
}