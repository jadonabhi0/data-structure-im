package Queue;

import java.util.Stack;

public class QueueUsingTwoStack<E>{

    private Stack<E> s1 = new Stack<>();
    private Stack<E> s2 = new Stack<>();


    public boolean isEmpty(){
        return s1.size() == 0 && s2.size() == 0;
    }

    public void offer(E data){
        s1.push(data);
    }

    public E poll(){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        E ans = s2.pop();
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return ans;
    }


    public E peek(){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        E ans = s2.peek();
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return ans;
    }
}
