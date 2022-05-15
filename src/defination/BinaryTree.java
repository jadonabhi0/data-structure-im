package defination;


 public class BinaryTree  {
     TreeNode root;

     public BinaryTree() {
         root = null;
     }

     public TreeNode insert(TreeNode root,int data){

        if(root == null){
            root = new TreeNode(data);
        }
        if(data < root.data){
            root.left = insert(root.left,data);
        }
        else if(data > root.data) {
            root.right = insert(root.right,data);
        }

        return root;
    }



    public void inOrder(TreeNode root){
         if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public void preOrder(TreeNode root){
         if(root == null) return;
        System.out.print(root.data+" ");
         preOrder(root.left);
         preOrder(root.right);
    }

    public void postOrder(TreeNode root){
         if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

//     public int noOfNodes(Trees.TreeNode root){
//         if (root == null) return 0;
//         int a = heightOfTree(root.left);
//         int b = heightOfTree(root.right);
//         int c = a+b+1;
//         return c;
//     }

}


class TreeNode{
    TreeNode left , right;
    int data;

    public TreeNode(int data) {
        this.data = data;
        left = right = null;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        BinaryTree bt = new BinaryTree();
        bt.insert(root,4);
        bt.insert(root,8);
        bt.insert(root,9);
        bt.insert(root,44);
        bt.insert(root,2);
        bt.insert(root,18);

        bt.inOrder(root);
        System.out.println();
        bt.preOrder(root);
        System.out.println();
        bt.postOrder(root);
        System.out.println();
    }








}


