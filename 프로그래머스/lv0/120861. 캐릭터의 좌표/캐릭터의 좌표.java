class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        
        for(int i=0; i<keyinput.length; i++) {
            switch(keyinput[i]) {
                case "up":
                    answer[1]++;
                    if (answer[1] > board[1] / 2) { 
                        answer[1] = board[1] / 2;
                    }
                    break;
                    
                case "down":
                    answer[1]--;
                    if (answer[1] < -(board[1] / 2)) { 
                        answer[1] = -(board[1] / 2); 
                    }
                    break;
                
                case "left":
                    answer[0]--;
                    if (answer[0] < -(board[0] / 2)) { 
                        answer[0] = -(board[0] / 2); 
                    }
                    break;
                    
                default:
                    answer[0]++;
                    if (answer[0] > board[0] / 2) { 
                        answer[0] = board[0] / 2; 
                    }
                    break;
            }
        }
        return answer;
    }
}