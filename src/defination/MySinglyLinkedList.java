package defination;
import adt.SinglyLinkedListADT;

import java.util.LinkedHashSet;
import java.util.LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

    public Node() {
    }

}

public class MySinglyLinkedList implements SinglyLinkedListADT {

    Node head;
    int counter=0;
    @Override
    public void add(int n) {
        Node node = new Node(n);
        if (head == null){
            head = node;
            counter++;
        }else
        {
            Node temp = head;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
            counter++;
        }
    }

    @Override
    public void add(int value, int position) {
        Node  node  = new Node(value);
        Node temp = head;
        if(position == 0){
            node.next = temp;
            head = node;
            counter++;
        }
        else {
            Node previous = null;
            while (position-- > 0) {
                previous = temp;
                temp = temp.next;
            }
            node.next = temp;
            previous.next = node;
            counter++;
        }
    }

    @Override
    public void print(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public void deleteList() {
        head = null;
        counter = 0;
    }

    @Override
    public boolean isEmpty() {
        return counter==0;
    }

    @Override
    public void nthNodeFromStart(int position) {
        if(position>size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        else {
            Node temp = head;
            while (position-- > 0) {
                temp = temp.next;
            }
            System.out.println(temp.data);
        }

    }

    @Override
    public void nthNodeFromEnd(int position) {
        int p = size();
        int n = p-position;
        nthNodeFromStart(n);
    }

    @Override
    public int search(int value) {
        Node temp = head;
        int index = 0;
        if (temp.data == value){
            return index;
        }
        else {
            while (temp.next != null && temp.data != value){
                temp = temp.next;
                index++;
            }
            return index;
        }


    }

    @Override
    public void middleNode() {
         nthNodeFromStart(size()/2);
    }

    @Override
    public int nodeFrequency(int value) {
        int fre =0 ;
        Node temp = head;
        if(head.data == value){
            fre++;
            temp = temp.next;
        }
        while (temp.next!=null){
            if (temp.data == value) {
                fre++;
                temp = temp.next;
            }
            else {
                temp = temp.next;
            }
        }
        if (temp.next == null && temp.data == value){
            fre++;
        }
        return fre;
    }

    @Override
    public void reverseIterative() {

        if(head == null){
            return;
        }
        else if(head.next == null){
            return;
        }


        Node previous = head;
        Node current  = head.next;

        while(current.next != null){
            Node nextnode = current.next;
            current.next = previous;

            // update

            previous = current;
            current = nextnode;

        }
        head.next = null;
        head = previous;


    }

    @Override
    public void reverseRecursively() {

    }

    @Override
    public void deleteWithPosition(int position) {
        Node temp = head;
        Node previous = null;
        if (position == 0){
            head = temp.next;
            counter--;
        }

        else {

            while (position-- > 0) {
                previous = temp;
                temp = temp.next;
            }
            previous.next = temp.next;
            counter--;
        }
    }

    @Override
    public void deleteWithValue(int value) {
        Node temp = head;
        Node previous = null;
        if (temp!=null && temp.data == value) {
                head = temp.next;
                counter++;
                return;
        }

       while (temp != null && temp.data!=value){
                previous = temp;
                temp = temp.next;
          }
        if (temp == null) {
            System.out.println("No value exist");
            return;
        }
        previous.next = temp.next;
        counter--;


       }


    public void createCycle(int n){
        Node temp = head;
        Node previous = null;
        Node target = null;
        while(temp!=null){
            previous  = temp;
            if (temp.data == n){
                 target = temp;
            }
            temp = temp.next;

        }
        previous.next = target;
    }

    public  boolean hasCycle(){

        Node slow = head;
        Node fast = head;
        boolean ans = false;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                ans = true;
                break;
            }else{
                ans =  false;
            }
        }
        return ans;
    }

    private boolean detectCycle(Node node){

        Node slow = node;
        Node fast = node;
        boolean ans = false;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                ans = true;
                break;
            }else{
                ans =  false;
            }
        }
        return ans;
    }

    public Object cyclicNode(){
        Node temp = head;
        Node meet = null;
        if (detectCycle(temp)){
            Node slow = temp;
            Node fast = temp;
            while(fast!=null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast){
                    meet = slow;
                    break;
                }
            }
            Node start = head;

            while (start != meet){
                start = start.next;
                meet = meet.next;
//
            }
        return meet;
        }
        else{
            return null;
        }
    }


    private  void insert(Node head,int data){
        Node node = new Node(data);
        Node temp = head;
        Node prev = null;
       if (temp == null){
           temp = node;
           System.out.println("inserted successfully"+temp.data);
       }else{
           while(temp!=null){
               prev = temp;
               temp = temp.next;
           }
           prev.next = node;
           System.out.println("inserted successfully");
       }
    }


    public void  evenOddList(){
        Node temp = head,prev = null;
        Node even = null;
        Node odd = null;
        Node temp2 = null;
        Node temp3 = null;
        while (temp!=null){
            prev = temp;
            temp = temp.next.next;
            if (even == null){
                even = prev;
            }else {
                temp2 = even;
                while (temp2 != null) {
                    temp3 = temp2;
                    temp2 = temp2.next;
                }
                temp.next = prev;
            }
        }
        while (even!= null){
            System.out.println(even.data);
            even = even.next;
        }

    }

    public static Node mergeTwoLists(Object n1, Object n2){
            Node first = (Node) n1;
            Node second = (Node) n2;
            Node dummy = new Node();
            Node ans = dummy;
            if (n1 == null) return (Node) n2;
            if (n2 == null) return (Node) n1;
            while(first!=null && second != null){
                if (first.data < second.data){
                   ans.next = first;
                   ans = ans.next;
                   first = first.next;
                }else{
                    ans.next = second;
                    second = second.next;
                    ans = ans.next;
                }
            }
            while(first!=null){
                ans.next = first;
                ans = ans.next;
                first = first.next;
            }
            while(second!=null){
                ans.next = second;
                second = second.next;
                ans = ans.next;
            }
            return dummy.next;
    }

    public Node swapNodeInPairs(){

        Node dummy = new Node(0);
        dummy.next = head;
        swap(dummy);
        return dummy.next;


    }
    private void swap(Node node){
        if(node == null) return;
        Node first = node.next;
        Node second = null;
        if(first!=null){
            second = first.next;
        }
        if (second!=null){
            Node secondnext = second.next;
            second.next = first;
            node.next = second;
            first.next = secondnext;
            swap(first);

        }
    }

    public Node rotateList(int k){
        Node tempp = head;
        int counter = 0 ;
        while (tempp!=null){
            tempp = tempp.next;
            counter++;
        }
        k = k%counter;
        Node dummy = head;
        Node prev = null;
        for (int i = 0; i < k; i++) {
            Node temp = head;
            while (temp.next!=null){
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            temp.next = dummy;
            dummy = temp;


        }
        return dummy;
    }


    private void inserttofun(Node node,int k){
        if (node == null) {
            node = new Node(k);
            System.out.println("insr");

        }else{
            Node prev = null;
            Node temp = node;
            while(temp!=null){
                prev = temp;
                temp = temp.next;
            }
            prev.next = new Node(k);

        }

    }


    public Node partition( int x) {
      Node temp = head;
      Node dummy1 = new Node(0);
      Node small= dummy1;
      Node dummy2 = new Node(0);
      Node large = dummy2;

      while(temp!=null){
          if (temp.data<x){
              small.next = new Node(temp.data);
              small=small.next;

          }else{
              large.next = new Node(temp.data);
              large = large.next;

          }
          temp = temp.next;
      }
      large.next = null;
      small.next = dummy2.next;
      return dummy1.next;
    }




    public Node removeDuplicatesfromSortedList_1(){
        Node dummy = new Node(0);
        Node res = dummy;
        Node temp = head;
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        while(temp!=null){
            set.add(temp.data);
            temp = temp.next;
        }
        for(int i : set){
            res.next = new Node(i);
            res = res.next;
        }

        return dummy.next;



    }

    public Node removeDuplicatesfromSortedList_2(){
        Node dummy = new Node(0);
        dummy.next = head;

        Node temp = head;
        Node prev = dummy;
        while(temp!=null){
            if (temp.next!=null && temp.data == temp.next.data){
                while(temp.next!=null && temp.data == temp.next.data){
                    temp = temp.next;
                }
                prev.next = temp.next;
            }else {
                prev = prev.next;
            }
            temp = temp.next;
        }
        return dummy.next;
    }






    }// class end


