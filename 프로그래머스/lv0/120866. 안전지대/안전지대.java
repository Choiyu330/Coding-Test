class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        int[][] new_board = new int[board.length][board[0].length];
        
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                if(board[i][j] == 1) {
                    range(i, j, new_board);
                }
            }
        }
        for(int i=0; i<new_board.length; i++) {
            for(int j=0; j<new_board.length; j++) {
                if(new_board[i][j] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
    void range(int i, int j, int[][] new_board) {
        
        new_board[i][j] = 1;
        
        if(i > 0 && j > 0) { new_board[i-1][j-1] = 1; } 
        if(i > 0) { new_board[i-1][j] = 1; }
        if(i > 0 && j < new_board.length - 1) { new_board[i-1][j+1] = 1; }
        
        if(j > 0) { new_board[i][j-1] = 1; }
        if(j < new_board.length - 1) { new_board[i][j+1] = 1; }

        if(i < new_board[0].length - 1 && j > 0) { new_board[i+1][j-1] = 1; }
        if(i < new_board[0].length - 1) { new_board[i+1][j] = 1; }
        if(i < new_board[0].length - 1 && j < new_board.length - 1) { new_board[i+1][j+1] = 1; }
    }
}