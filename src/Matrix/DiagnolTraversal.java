package Matrix;

import java.util.LinkedList;

public class DiagnolTraversal {

    public static void helper(int [][] matrix){

        for(int g = 0 ; g < matrix.length ; g++){

            for(int i = 0, j = g ; j < matrix.length ; i++, j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


        for(int g = 0 ; g < matrix.length ; g++){

            for(int i = 0, j = g ; j < matrix.length ; i++, j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }


        for(int g = 0 , k = 0; k < matrix[0].length ; g++,k++){

            for(int i = k, j = 0 ; i>=0 ; i--, j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


        for(int g = 0 ; g < matrix[0].length ; g++){

            for(int i = matrix.length-1, j = g ; j< matrix.length ; i--, j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {

        int[][] matrix = {{1,2,3,4,5},
                         {6,7,8,9,10},
                         {11,12,13,14,15},
                         {16,17,18,19,20},
                         {21,22,23,24,25}};

        helper(matrix);

    }


}
