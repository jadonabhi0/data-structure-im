class Node {
    int data ;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

}

public class SinglyLinkedList {
    Node head;
    public void insert(int n){
        Node node = new Node(n);
        if (head == null){
            head = node;
        }else {
            Node temp = head;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void print(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data+ " " );
            temp = temp.next;
        }
        System.out.println();
    }

    public void deleteLast(){
        Node temp = head;
        Node secLast = null;
        while (temp.next!=null){
            secLast = temp;
            temp = temp.next;
        }
        secLast.next = null;

    }
    public void delete(int position){
        Node temp = head;
        if (position == 0){
            head = temp.next;
        }
        else{

            Node privious = null;
            while (position-- > 0){
                privious = temp;
                temp = temp.next;
            }
            privious.next = temp.next;
        }
    }

    public void insert(int number,int position){
        Node node = new Node(number);
        if (position == 0){
            node.next = head;
            head = node;
        }
        else {

            Node temp = head;
            while (position-->0){
                temp = temp.next;

            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insert(1);
        singlyLinkedList.insert(2);
        singlyLinkedList.insert(3);
        singlyLinkedList.insert(4);
        singlyLinkedList.insert(5);


        singlyLinkedList.insert(5,2);
        singlyLinkedList.print();
    }

}
