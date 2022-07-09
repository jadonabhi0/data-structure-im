package Queue;

public class QueueUsingLinkedList {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rare;

    public boolean isEmpty(){
        return front == null && rare == null;
    }

    public void offer(int data){
        Node newNode = new Node(data);
        if (isEmpty()){
            front = newNode;
            rare = newNode;
            return;
        }
        rare.next = newNode;
        rare = newNode;

    }

    public int poll(){
        if (isEmpty()){
            System.out.println("empty");
            return -1;
        }
        int res = front.data;
        front = front.next;
        return res;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("empty");
            return -1;
        }
        return front.data;
    }

}
