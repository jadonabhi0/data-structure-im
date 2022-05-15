package defination;
import adt.StackInterfaceADT;


class NodeStack{
    NodeStack next;
    int data;

    public NodeStack(int data) {
        this.data = data;
        next = null;
    }
}

public class StackUsingLinkedList implements StackInterfaceADT{


    static int size = 0;
    NodeStack head;
    NodeStack top = null;


    @Override
    public void push(int number) {
        NodeStack node = new NodeStack(number);

        if(head == null){
            head = node;
            top = node;
            size++;
        }
        else{
            NodeStack temp = head;

            while(temp.next !=null){
                temp = temp.next;

            }
            top = node;
            temp.next = node;
            size++;


        }



    }

    @Override
    public void pop() { // currently, not working
        NodeStack temp = head;
        NodeStack previous = null;
        while (temp!=null){
            previous = temp;
            temp=temp.next;
        }
    previous.next = null;



    }

    @Override
    public int peek(int index) {
        NodeStack temp = head;
        while(index-->0){
            temp  = temp.next;
        }
        return temp.data;

    }

    @Override
    public int get() {

        NodeStack temp = head;
        NodeStack previous = null;
     return  top.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void print() {
        NodeStack temp = head;
        while(temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    @Override
    public boolean isEmpty() {
        return false;
    }



}
