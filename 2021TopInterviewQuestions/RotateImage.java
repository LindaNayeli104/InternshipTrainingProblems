//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/770/

class Solution {
    public void rotate(int[][] matrix) {
        int[][] res = new int[matrix.length][matrix.length];
        
        for(int i=0; i<matrix.length; i++){
            for(int j=matrix.length-1; j>=0; j--){
                res[i][Math.abs(j-matrix.length+1)] = matrix[j][i];
            }
        }
         for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                matrix[i][j] = res[i][j];
            }
        }
    }
}