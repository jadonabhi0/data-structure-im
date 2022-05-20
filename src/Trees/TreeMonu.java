package Trees;

public class TreeMonu {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node (int data){
            this.data = data;
            left = null;
            right = null;
        }

    }
    private Node root;

    public TreeMonu(int [] in){
       this.root =  create_tree(in,0,in.length-1);
    }

    private Node create_tree(int [] in , int lo , int hi){
        if(hi<lo) return null;
        int mid = (lo+hi)/2;
        Node node = new Node(in[mid]);
        node.left = create_tree(in,lo,mid-1);
        node.right  = create_tree(in,mid+1,hi);
        return node;
    }

    public void Display(){
        Display(root);
        System.out.println();
    }

    private void Display(Node node){
        if(node == null) return;
        System.out.print(node.data+" ");
        Display(node.left);
        Display(node.right);
    }


    public static void main(String[] args) {

        int[] ar = {1,2,3,4,5,6,7,8,9};
        TreeMonu b = new TreeMonu(ar);
        b.Display();


    }


}
