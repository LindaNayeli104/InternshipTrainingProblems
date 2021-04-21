https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/769/

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hs = new HashSet<>();
        int current;
        for(int i=0; i< 9; i++){
            for(int j=0; j< 9; j++){
                current = board[i][j];
                if(current != '.'){
                    if(!hs.add(current + " row " + i ) ||
                       !hs.add(current + " column " + j) ||
                       !hs.add(current + " box " + i/3 + "-" + j/3) 
                      )return false;
                }
            }
            
        }
        return true;
    }
}