package Matrix;

import java.util.Arrays;

public class diag {

    public static void findDiagonalOrder(int[][] matrix) {
        int n = matrix.length*matrix[0].length;
        int[] array = new int[n];
        int k = 0;
        for(int g = 0 ; g < matrix[0].length ; g++){

            for(int i = g, j = 0 ; i>=0 ; i--, j++){
                if(g % 2 == 0){
                    array[k++] = matrix[i][j];
                }else{
                    array[k++] = matrix[j][i];
                }
            }
        }

        for(int gg = 1 ; gg < matrix[0].length ; gg++){

            for(int i = matrix.length-1, j = gg ; j< matrix.length ; i--, j++){
                if (gg % 2 == 0){
                    array[k++] = matrix[i][j];
                }else{
                    array[k++] = matrix[j][i];
                }
            }

        }

//        System.out.println(Arrays.toString(array));
    }


    public static void main(String[] args) {

        int[][] matrix = {{1,2,3,4,5},
                         {6,7,8,9,10},
                         {11,12,13,14,15},
                         {16,17,18,19,20},
                         {21,22,23,24,25},
                         };
        findDiagonalOrder(matrix);




    }

}
