import java.util.*;

class Solution {
    public int solution(int[] array) {
        // 정렬 먼저
        // (첫번째 + 마지막) / 2 = 중앙값 -> 인덱스 위치를 알아야하는데
        Arrays.sort(array);
        
        int answer = array[array.length/2];
        return answer;
    }
}