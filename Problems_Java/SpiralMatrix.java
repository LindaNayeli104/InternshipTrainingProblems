import java.util.*;
class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        int[] spiral = new int[matrix.length * matrix[0].length];
        boolean ascendent = true;
        int count=0;

        spiral.append(matrix[0][0]);
        
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[0].length; j++){
                if(!ascendent){
                    count = matrix.length-1;
                }
                else{
                    count = 0;
                }

                spiral.append(matrix[][]);
                
            }
        }
    }
}