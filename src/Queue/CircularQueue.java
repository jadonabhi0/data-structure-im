package Queue;

public class CircularQueue {

    int[] array ;
    int front;
    int rare;
    int size;

    public CircularQueue(int n){
        this.array = new int[n];
        this.front = -1;
        this.rare = -1;
        this.size = n;
    }

    public boolean isEmpty(){
        return front == -1 && rare == -1;
    }

    public boolean isFull(){
        return (rare+1) % size == front;
    }

    // enque  --- O(1)
    public void offer(int data){
        if (isFull()){
            throw new ArrayIndexOutOfBoundsException();
        }

        // ist element add
        if (front == -1){
            front = 0;
        }

        rare = (rare+1) % size;
        array[rare] = data;
    }

    public int poll(){
        if (isEmpty()){
            System.out.println("empty");
            return -1;
        }

        int res = array[front];

        // single element cond
        if (front == rare){
            rare = front = -1;
        }else {
            front = (front+1) % size;
        }
        return res;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("empty");
            return -1;
        }

        return array[front];

    }

}
