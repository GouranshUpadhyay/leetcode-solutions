class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        List<int[]> zero=new ArrayList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    zero.add(new int[]{i,j});
                }
            }
        }
        for(int[] pos:zero){
            int r=pos[0];
            int c=pos[1];
            for(int j=0;j<col;j++){
                matrix[r][j]=0;
            }
            for(int i=0;i<row;i++){
                matrix[i][c]=0;
            }
        }
    }
}