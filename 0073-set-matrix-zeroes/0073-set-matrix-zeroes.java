// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int row=matrix.length;
//         int col=matrix[0].length;
//         List<int[]> zero=new ArrayList<>();
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 if(matrix[i][j]==0){
//                     zero.add(new int[]{i,j});
//                 }
//             }
//         }
//         for(int[] pos:zero){
//             int r=pos[0];
//             int c=pos[1];
//             for(int j=0;j<col;j++){
//                 matrix[r][j]==0;
//             }
//             for(int i=0;i<row;i++){
//                 matrix[i][c]=0;
//             }
//         }
//     }
// }

// Better approach

class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            if (rows[i]) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 0; j < n; j++) {
            if (cols[j]) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}