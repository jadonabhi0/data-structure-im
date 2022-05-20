package Stacks;

import java.util.ArrayList;

public class StackUsingArrayList {

    private ArrayList<Integer> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void push(int data){
        list.add(data);
    }

    public int pop(){
        return list.remove(list.size()-1);
    }
    public int peek(){
        return list.get(list.size()-1);
    }

}
