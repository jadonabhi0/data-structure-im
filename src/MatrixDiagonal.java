public class MatrixDiagonal {
    public static int diagonalSum(int[][] mat){
        int n = mat.length;
        int sum1 = 0 ;
        int sum2 = 0;
        int total = 0;
        int temp = 0;
        for (int i = 0 ; i < n; i++){
            for (int j = 0 ; j < n ; j++){
                if(i == j){
                    sum1+=mat[i][j];
                }
                if (i+j == n-1){
                    sum2 += mat[i][j];
                }
            }
        }

        if (n%2!=0){
            temp = mat[n/2][n/2];
            total = sum1+sum2-temp;
        }else{
            total = sum1+sum2;
        }
        return total;
    }
    public static void main(String[] args) {
        int[][] array = new int[][]{{1,2,3},{2,3,4},{1,5,6}};
        System.out.println(diagonalSum(array));
    }
}
