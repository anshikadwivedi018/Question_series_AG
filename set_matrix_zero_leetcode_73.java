class Solution {
    public void markRow(int[][] matrix,int row,int col){
        for(int i=0;i<col;i++){
            if(matrix[row][i]!=0)
            matrix[row][i]=-123456;
        }
    }
    public void markCol(int[][] matrix,int row,int col){
        for(int i=0;i<row;i++){
            if(matrix[i][col]!=0)
            matrix[i][col]=-123456;
        }
    }
    public void setZeroes(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    markRow(matrix,i,matrix[0].length);
                    markCol(matrix,matrix.length,j);
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==-123456){
                   matrix[i][j]=0;
                }
            }
        }
    }
}