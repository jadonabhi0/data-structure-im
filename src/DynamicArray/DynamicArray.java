package DynamicArray;


import java.util.Arrays;

class MyArray{
    int[] array = new int[4];

    public MyArray(){
        Arrays.fill(this.array, Integer.MIN_VALUE);
    }
    private int c = 0;
    public void add(int n){
        this.array[c++] = n;
        if(c == array.length-1) reHashing();
    }

    public void reHashing(){
        int[] oldArray = this.array;
        int[] newArray = new int[oldArray.length * 2];
        Arrays.fill(newArray, Integer.MIN_VALUE);
        int c = 0;
        for(int i : oldArray){
            newArray[c++] = i;
        }
        this.array = newArray;
    }

    public void printArray(){
        for (int i : this.array) {
            if (i != Integer.MIN_VALUE){
                System.out.print(i+" ");
            }
        }
    }
}



public class DynamicArray {

    public static void main(String[] args) {

        MyArray array = new MyArray();

        array.add(8);
        array.add(8);
        array.add(8);
        array.add(8);
        array.add(8);
        array.add(8);
        array.add(8);
        array.add(8);

        array.printArray();


    }

}