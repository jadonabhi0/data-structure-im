package Stacks;

public class StackUsingLinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    private Node head;

    public boolean isEmpty(){
        return head == null;
    }

    // TC --> O(n)
    public void push(int data){
        Node node = new Node(data);
         if (head == null){
             head = node;
             return;
         }
         Node temp = head;
         Node prev = null;

         while(temp != null){
             prev = temp;
             temp = temp.next;
         }
        prev.next = node;
    }

    // TC --> O(n)

    public int pop(){

        // if stack is empty;
        if(head == null){
            System.out.println("empty");
            return -1;
        }

        // if one element left
        if (head.next == null){
            int ans = head.data;
            head = null;
            return ans;
        }

        Node temp = head;
        Node prev = null;

        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return temp.data;
    }

    // TC --> O(n)
    public int peek(){
        // if stack is empty;
        if(head == null){
            System.out.println("empty");
            return -1;
        }

        // if one element left
        if (head.next == null){
            int ans = head.data;
            head = null;
            return ans;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        return temp.data;
    }


}
