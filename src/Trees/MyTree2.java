package Trees;

public class MyTree2 {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    static class BinaryTree{

        static int idx = -1;
        public  Node create_Tree(int[] nodes){
             idx++;
             if(nodes[idx] == -1) return null;
             Node node = new Node(nodes[idx]);
             node.left = create_Tree(nodes);
             node.right = create_Tree(nodes);
             return node;
        }

        public  void inOrder(Node root){
            if (root == null) return;
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

        public  void preOrder(Node root){
            if (root == null) return;
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public  void postOrder(Node root){
            if (root == null) return;
            preOrder(root.left);
            preOrder(root.right);
            System.out.print(root.data+" ");
        }


    }


    public static void main(String[] args) {
        int[] nodes = new int[]{1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.create_Tree(nodes);
        tree.inOrder(root);
        System.out.println();
        tree.preOrder(root);
        System.out.println();
        tree.postOrder(root);
    }


}
