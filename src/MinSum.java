import java.util.HashSet;

class MinSum{

    static void findMin(int prod){
        HashSet<Integer> set = new HashSet<>();
        int counter = 0 ;
        for(int i = 1 ; i <= prod ; i++){
            for(int j = 1 ; j <= prod ; j++){
                if( i*j >= prod && i+j < prod){
                    set.add(i+j);
                 }
            }
        }

        printArrary(set);
    }
    static void printArrary(HashSet<Integer> array){
        for (int i : array){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
       findMin(15);
    }
}