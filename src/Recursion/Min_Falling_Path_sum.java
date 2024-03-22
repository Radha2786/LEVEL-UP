package Recursion;

// apply dp
public class Min_Falling_Path_sum {
    public static void main(String[] args) {
        int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        int min= Integer.MAX_VALUE;

            for (int j=0; j<matrix[0].length ; j++){
                min=Math.min(minFallingPath(0,j,matrix),min);
            }

//        return min;
        System.out.println(min);
    }
    public static int minFallingPath(int row , int col , int[][] matrix){
        if(col<0 || col>=matrix.length){
            return Integer.MAX_VALUE;
        }
        // Base condition
        if(row==matrix.length-1){
            return matrix[row][col];
        }
        // call for left
        int left=minFallingPath(row+1,col-1,matrix);
        int down=minFallingPath(row+1,col,matrix);
        int right = minFallingPath(row+1,col+1,matrix);

        return matrix[row][col] + Math.min(left,Math.min(right,down));


    }
}
