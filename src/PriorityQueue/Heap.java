package PriorityQueue;

import java.util.ArrayList;

public class Heap {

    // it is a complete binary tree
    // each element is associated with some priority


    // types of priority
    // 1-- Rank
    // 2-- Marks

    private ArrayList<Integer> list = new ArrayList<>();

    public void add(int item){
        this.list.add(item);
        upHeapify(this.list.size()-1);
    }

    public int remove(){
        swap(0,this.list.size()-1);
        int rv = this.list.remove(this.list.size()-1);
        downHeapify(0);
        return rv;
    }

    public int getMin(){
        return  this.list.get(0);
    }

    public void display(){
        System.out.println(this.list);
    }


    private void downHeapify(int pi) {
        int c1 = 2*pi+1;
        int c2 = 2*pi+2;
        int mini = pi;


        if(c1 < this.list.size() && this.list.get(c1) < this.list.get(mini)){
            mini = c1;
        }
        if (c2 < this.list.size() && this.list.get(c2) < this.list.get(mini)){
            mini = c2;
        }
        if(mini != pi){
            swap(mini,pi);
            downHeapify(mini);
        }

    }


    private void upHeapify(int ci) {
        int pi = (ci-1)/2;
        if (this.list.get(pi) > this.list.get(ci)){
            swap(ci,pi);
            upHeapify(pi);
        }
    }



    private void swap(int i, int j){
        int ith = this.list.get(i);
        int jth = this.list.get(j);
        this.list.set(i,jth);
        this.list.set(j,ith);
    }

    
    
    

    public static void main(String[] args) {

        Heap heap = new Heap();
        heap.add(1);
        heap.add(10);
        heap.add(12);
        heap.add(6);
        heap.add(-1);
        heap.add(20);
        heap.add(4);
        heap.display();
        System.out.println(heap.getMin());
        System.out.println(heap.remove());
        heap.display();

    }








}
