class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {	
        ArrayList<Integer> spiral = new ArrayList<>();
        
        if(matrix == null || matrix.length == 0){
            return spiral;
        }
        
        int r = matrix[0].length-1;
        int d = matrix.length-1;
        int l = 0;
        int u = 0;
        int size = matrix.length * matrix[0].length;
        while(spiral.size() < size){
            for(int i=l; i<=r && spiral.size() < size ; i++){
                spiral.add(matrix[u][i]);
            }
            u++;
            for(int i=u; i<=d && spiral.size() < size ; i++){	
                spiral.add(matrix[i][r]);
            }
            r--;

            for(int i=r; i>=l && spiral.size() < size ; i--){
                spiral.add(matrix[d][i]);
            }
            d--;

            for(int i=d; i>=u && spiral.size() < size ; i--){
                spiral.add(matrix[i][l]);
            }
            l++;
        }
        return spiral;
    }
}