import java.nio.BufferUnderflowException;

public final class StackArray {

    static class MyStack{


        int[] array;
        int top;
        int size;
        int a ;

        public MyStack(int size){
            this.size = size;
            this.array = new int[size];
            this.top = -1;
            this.a = -1;
        }



        public boolean isEmpty(){
            return top == -1;
        }

        public  boolean isFull(){
            if(top+1 == size)
                return true;
            else
                return false;
        }
        public int size(){
            if(top == -1){
                return 0;
            }
            else{
                return top+1;
            }
        }

        public void push(int data){
            if (!isFull()){
                top++;
                a++;
                array[top] = data;
            }
            else {
                throw new StackOverflowError();
            }

        }
        public int pop(){
            if(!isEmpty()){
                int a = array[top];
                array[top] = 0;
                a--;
                top--;
                return a;
            }
            else{
                throw new BufferUnderflowException();
            }
        }

        public int peek(){
            if(!isEmpty()){
                int s = array[a];
                a--;
                return s;
            }
            else{
                throw new BufferUnderflowException();
            }
        }

    }

    public static void main(String[] args){
        MyStack st = new MyStack(7);
        st.push(8);
        st.push(81);
        st.push(82);
        st.push(83);
        st.push(84);


//        System.out.println(st.isFull());
//        System.out.println(st.isEmpty());
//        System.out.println(st.size());
//        System.out.println(st.pop());
//        System.out.println(st.pop());
//        System.out.println(st.size());


        System.out.println(st.peek());
        System.out.println(st.peek());
        System.out.println(st.peek());
        System.out.println(st.peek());
        System.out.println(st.peek());
        System.out.println(st.peek());


    }


}

