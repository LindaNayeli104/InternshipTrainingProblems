class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }
        
        int islands = 0;
        
        for(int i=0; i< grid.length; i++){
            for(int j=0; j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    islands += checkN(grid, i, j);
                }
            }
        }
        
        return islands;
    }
    
    
    public int checkN(char[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0'){
            return 0;
        }
        
        grid[i][j] = '0';
        checkN(grid, i+1, j);
        checkN(grid, i-1, j);
        checkN(grid, i, j+1);
        checkN(grid, i, j-1);
        return 1;
    }
}