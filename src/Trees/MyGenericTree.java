package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class MyGenericTree {

    static class Node{
        int data;
        ArrayList<Node> children ;
        public Node(int data){
            this.data = data;
            this.children = new ArrayList<>();
        }
    }

    private Node root;
    public MyGenericTree(int[] array){
        Stack<Node> st = new Stack<>();
        for (int i = 0 ; i < array.length ; i++){

            if (array[i] == -1){
                st.pop();
            }else{
                Node node = new Node(array[i]);
                if (st.size()>0){
                    Node top = st.peek();
                    top.children.add(node);
                }else {
                    this.root = node;
                }
                st.push(node);
            }
        }
    }

    public void display(){
        System.out.print(root.data+" --> ");{
            for (Node child : root.children){
                System.out.print(child.data+" ");
            }
            System.out.println();

            for (Node child : root.children){
                root = child;
                display();
            }
        }
    }



}
