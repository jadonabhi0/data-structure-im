package Queue;


public class QueueUsingArray {

    static class Queue{
        int[] array;
        int rare;
        int size;
        public Queue(int n){
            array = new int[n];
            rare = -1;
            size = n;
        }

        public boolean isEmpty(){
            return rare == -1;
        }

        public boolean isFull(){
            return rare == size-1;
        }

        // enque
        public void offer(int data){
            if(!isEmpty()){
               throw new IndexOutOfBoundsException();
            }
            rare++;
            array[rare] = data;
        }

        // deque
        public int poll(){
            if (rare == -1){
                throw new IndexOutOfBoundsException();
            }
            int top = array[0];
            for(int i = 0 ; i < rare ; i++){
                array[i] = array[i+1];
            }
            rare--;
            return top;
        }


        public int peek(){
            if (rare == -1){
                throw new IndexOutOfBoundsException();
            }
            return array[0];
        }


        public int size(){
            return rare+1;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);


        for (int i = 0 ; i < 5 ; i++){
            System.out.println(q.peek());
            q.poll();
        }
    }


}
