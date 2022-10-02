package PriorityQueue;

import java.util.ArrayList;

public class HeapPep {

    private ArrayList<Integer> root;

    public HeapPep(){
        this.root = new ArrayList<>();
    }

    public int size(){
        return root.size();
    }
    public int peek(){
        return this.root.get(0);
    }

    public void insert(int data){
        this.root.add(data);
        upHeapify(this.root.size()-1);
    }

    private void upHeapify(int ci){
        int pi = (ci-1)/2;
        if(this.root.get(pi) > this.root.get(ci)){
            swap(ci, pi);
            upHeapify(pi);
        }
    }

    public int poll(){
        if(this.root.size() == 0){
            return -1;
        }
        swap(0, this.root.size() - 1);
        int rm = this.root.remove(this.root.size()-1);
        downHeapify(0);
        return rm;
    }

    private void downHeapify(int pi){
        int c1 = 2*pi + 1;
        int c2 = 2*pi + 2;
        int min = pi;
        if (c1 < this.root.size() && this.root.get(c1) < this.root.get(min)){
            min = c1;
        }
        if(c2 < this.root.size() && this.root.get(c2) < this.root.get(min)){
            min = c2;
        }

        if(min != pi){
            swap(pi, min);
            downHeapify(min);
        }
    }

    private void swap(int i, int j){
        int ith = this.root.get(i);
        int jth = this.root.get(j);
        this.root.set(i, jth);
        this.root.set(j, ith);
    }

}
