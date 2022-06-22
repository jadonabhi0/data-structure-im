package Matrix;

public class ZiczacTraversal {

    public static void helper(int[][] matrix){

        for(int j = 0 ; j < matrix[0].length ; j++){
            if (j % 2 == 0){

                for (int i = 0; i < matrix.length ; i++){

                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }else{

                for (int i = matrix.length-1; i >= 0 ; i--){

                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }

        }


    }


    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        helper(matrix);


    }


}
