class Solution {
    public int solution(int[] box, int n) {
        int[] max_box = new int[3];
        
        // box[i] / n 만큼 넣을 수 있음
        for(int i=0; i<box.length; i++) {
            max_box[i] = box[i] / n;
        }
        return max_box[0] * max_box[1] * max_box[2];
    }
}