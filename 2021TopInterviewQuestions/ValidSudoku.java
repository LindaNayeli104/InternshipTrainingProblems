//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/769/

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> hs = new HashSet<>();
        //Check all cols
        for(int col=0; col< 9; col++){
            hs.clear();
            for(int row=0; row< 9; row++){
                if(board[row][col] != '.'){
                    if(hs.contains(board[row][col])){
                        return false;
                    }
                    hs.add(board[row][col]);
                }  
            }
        }
        //Check all rows
        for(int row=0; row< 9; row++){
            hs.clear();
            for(int col=0; col< 9; col++){
                 if(board[row][col] != '.'){
                    if(hs.contains(board[row][col])){
                        return false;
                    }
                    hs.add(board[row][col]);
                 }   
            }
        }
        //Check quadrant
        
        hs.clear();
        for(int row=0; row< 3 ;row++){
            for(int col=0; col< 3; col++){
                if(board[row][col] != '.'){
                    if(hs.contains(board[row][col])){
                        return false;
                    }
                    hs.add(board[row][col]);
                }
                
            }
        }
        
        hs.clear();
        for(int row=3; row< 6;row++){
            for(int col=0; col< 3; col++){
                if(board[row][col] != '.'){
                    if(hs.contains(board[row][col])){
                        return false;
                    }
                    hs.add(board[row][col]);
                } 
            }
        }
         hs.clear();
        for(int row=6; row< 9 ;row++){
            for(int col=0; col< 3; col++){
                if(board[row][col] != '.'){
                    if(hs.contains(board[row][col])){
                        return false;
                    }
                    hs.add(board[row][col]);
                }
                
            }
        }
        
        hs.clear();
        for(int row=0; row< 3 ;row++){
            for(int col=3; col< 6; col++){
                if(board[row][col] != '.'){
                    if(hs.contains(board[row][col])){
                        return false;
                    }
                    hs.add(board[row][col]);
                }
                
            }
        }
        
        hs.clear();
        for(int row=3; row< 6;row++){
            for(int col=3; col< 6; col++){
               if(board[row][col] != '.'){
                    if(hs.contains(board[row][col])){
                        return false;
                    }
                    hs.add(board[row][col]);
                }
                
            }
        }
         hs.clear();
        for(int row=6; row< 9 ;row++){
            for(int col=3; col< 6; col++){
                if(board[row][col] != '.'){
                    if(hs.contains(board[row][col])){
                        return false;
                    }
                    hs.add(board[row][col]);
                }
                
            }
        }
        
        hs.clear();
        for(int row=0; row< 3 ;row++){
            for(int col=6; col< 9; col++){
                 if(board[row][col] != '.'){
                    if(hs.contains(board[row][col])){
                        return false;
                    }
                    hs.add(board[row][col]);
                 }
               
            }
        }
        
        hs.clear();
        for(int row=3; row< 6;row++){
            for(int col=6; col< 9; col++){
                if(board[row][col] != '.'){
                    if(hs.contains(board[row][col])){
                        return false;
                    }
                    hs.add(board[row][col]);
                }
                
            }
        }
         hs.clear();
        for(int row=6; row< 9 ;row++){
            for(int col=6; col< 9; col++){
               if(board[row][col] != '.'){
                    if(hs.contains(board[row][col])){
                        return false;
                    }
                    hs.add(board[row][col]);
                }
                
            }
        }
        
        return true;
    }
}