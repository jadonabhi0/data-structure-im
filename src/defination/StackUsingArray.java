package defination;
import adt.StackInterfaceADT;
import java.util.Map;

public class StackUsingArray implements StackInterfaceADT {

    static final int MAX = 5;
    int top;
    int [] array = new int[MAX];
    static int size = 0;

    public StackUsingArray(){
        top = -1;
    }



    @Override
    public void push(int number) {
         if(top > MAX){
             System.out.println("Stack Overflow");
             throw new ArrayIndexOutOfBoundsException();


         }


        array[++top] = number;
        size++;

    }

    @Override
    public void pop() {
        array[top] = 0;
        size--;
        top--;
    }

    @Override
    public int peek(int index) {
        return array[index];
    }

    @Override
    public int get() {
        return array[top--];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void print() {

    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}
