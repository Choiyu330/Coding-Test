class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        
        for(int i=0; i<sizes.length; i++) {
            // 가로, 세로 길이 중 긴 변 정렬
            if(sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            // 가로, 세로 길이 최대값 구하기
            if(width < sizes[i][0]) {
                width = sizes[i][0];
            }
            if(height < sizes[i][1]) {
                height = sizes[i][1];
            }
        }
        return width * height;
    }
}