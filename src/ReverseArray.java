public class ReverseArray {

    public void reverseArray(int[] array, int idx, int idx2){
        if (idx == array.length){
            return;
        }


        int n = array[idx];
        reverseArray(array, idx+1,idx2-1);
       array[idx2] = n;


    }


    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        int[] ar = new int[]{1,2,3,4,5};
        reverseArray.reverseArray(ar,0, 4);

        for (int i : ar){
            System.out.print(i+" ");
        }
    }

}
