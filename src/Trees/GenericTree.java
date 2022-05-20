package Trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class GenericTree {

     static class Node{
        int data;
         ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node){
         String str = node.data+"--> ";
         for (Node n : node.children){
             str += n.data+", ";

         }
         str += ".";
        System.out.println(str);
        for (Node no : node.children){
            display(no);
        }
    }

    public static int size(Node node){
         int s = 0;
         for (Node chile : node.children){
             int cs = size(chile);
             s+=cs;
         }
         s+=1;
         return s;

    }

    public static int maximum(Node node){
         int max = Integer.MIN_VALUE;
         for (Node child : node.children){
             int cm = maximum(child);
             max = Math.max(max,cm);
         }
         max = Math.max(node.data, max);
         return max;
    }

    public static int height(Node node)
    {
        int ht = -1;
        for (Node child : node.children){
            int ch = height(child);
            ht = Math.max(ch,ht);
        }
        ht+=1;
        return ht;
    }

    public static void preOrder(Node node){
        System.out.print(node.data+" ");
        for(Node child: node.children){
            preOrder(child);
        }

    }
    public static void postOrder(Node node){
        for(Node child: node.children){
            postOrder(child);
        }
        System.out.print(node.data+" ");
    }

    public static void inOrder(Node node){
        for(Node child: node.children){
            inOrder(child);
            System.out.print(child.data+" ");
        }

    }

    public static void levelOrderTraversal(Node node){
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        while(!q.isEmpty()){
            node = q.remove();
            System.out.print(node.data+" ");
            for(Node chile: node.children){
                q.add(chile);
            }

        }
        System.out.println(".");
    }

    public static void leverOrderTraversalLinewise(Node node){
         Queue<Node> mq = new ArrayDeque<>();
         mq.add(node);
        Queue<Node> cq = new ArrayDeque<>();
        while(!mq.isEmpty()){
            node = mq.remove();
            System.out.print(node.data+" ");

            for(Node child : node.children){
                cq.add(child);
            }
            if (mq.size() == 0){
                mq = cq;
                cq = new ArrayDeque<>();
                System.out.println();
            }
        }

    }

    public static void levelOrderZicZac(Node node){

    }


    public static void main(String[] args) {

        int[] array = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1 };
        Stack<Node> st = new Stack<>();
        Node root = null;
        for (int i = 0 ; i < array.length ; i++){
            if (array[i] == -1){
                st.pop();
            }else{
                Node node = new Node();
                node.data = array[i];
                if (st.size()>0){
                    Node top = st.peek();
                    top.children.add(node);
                    st.push(node);
                }else{
                    root = node;
                    st.add(root);
                }

            }
        }

//        display(root);
//        System.out.println(size(root));
//        System.out.println(maximum(root));
//        System.out.println(height(root));
//        preOrder(root);
//        System.out.println();
//        postOrder(root);
//        System.out.println();
//        inOrder(root);
//        levelOrderTraversal(root);
//        leverOrderTraversalLinewise(root);

        
    }


}
