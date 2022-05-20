package Stacks;

public class StackUsingArray {

    private int[] array;
    private int size;
    private int top;

    public StackUsingArray(int n){
        array = new int[n];
        top = -1;
    }


    public boolean isEmpty(){
        return top == -1;
    }

    private boolean isFull(){
        return top == array.length-1;
    }

    public int size(){
        return size;
    }

    public boolean push(int data){
        if (isFull()){
            System.out.println("Already full");
            throw new ArrayIndexOutOfBoundsException();
        }
        top++; size++;
        array[top] = data;
        return true;
    }

    public int pop(){
        if (isEmpty()) {
            System.out.println("Empty");
            throw new ArrayIndexOutOfBoundsException();
        }
        top--;size--;
        return array[top];
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Empty");
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[top];
    }
}
