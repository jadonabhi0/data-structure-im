package Matrix;

public class ExitPoint {

    public static void helper(int[][] array){

        int dir = 0; // 0 --> east || 1 --> south || 2 --> west || 3 --> north
        int i = 0;
        int j = 0;

        while(true){

            dir = (dir+array[i][j]) % 4;

            if(dir == 0){ // east
                j++;
            }else if (dir == 1){ // south
                i++;
            }else if(dir == 2){ // west
                j--;
            }else{ // north
                i--;

            }


            if (i < 0){
                i++;
                break;
            }else if (i == array.length){
                i--;
                break;
            }else if (j < 0){
                j++;
                break;
            }else if (j == array[0].length){
                j--;
                break;
            }



        }
        System.out.println(i+", "+j);

    }


    public static void main(String[] args) {

        int[][] array = {{1,0,0,0,0,1,1},
                         {0,1,0,0,0,0,1},
                         {0,0,0,0,0,0,0},
                         {1,0,0,0,0,0,1},
                         {1,1,0,0,0,1,0}};

        helper(array);

    }


}
