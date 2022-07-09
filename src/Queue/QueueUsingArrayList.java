package Queue;

import java.util.ArrayList;

public class QueueUsingArrayList {

    private ArrayList<Integer> list = new ArrayList<>();



    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void offer(int data){
        list.add(data);
    }

    public int poll(){
        if (list.isEmpty()){
            System.out.println("empty");
            return -1;
        }
        return list.remove(0);
    }

    public int peek(){
        if (list.isEmpty()){
            System.out.println("empty");
            return -1;
        }
        return list.get(0);
    }
}
