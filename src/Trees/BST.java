package Trees;


import java.util.LinkedList;
import java.util.Queue;

class TreeNode{

        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        public TreeNode(){

        }
    }

    class Tree{
        TreeNode root;
        public Tree(){
            this.root = null;
        }

        public TreeNode insert(TreeNode root,int data){
            if (root == null){
                root = new TreeNode(data);
            }
            else if(data < root.data){
                root.left = insert(root.left,data);
            }else {
                root.right = insert(root.right,data);
            }
            return root;
        }


        public void inOrder(TreeNode root){
            if (root == null) return;
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
//            System.out.println();
        }
        public void preOrder(TreeNode root){
            if (root == null) return;
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
//            System.out.println();
        }

        public void postOrder(TreeNode root){
            if (root == null) return;
            preOrder(root.left);
            preOrder(root.right);
            System.out.print(root.data+" ");
//            System.out.println();
        }

        public int heightOfTree(TreeNode root){
            if (root == null) return 0;
            int a = heightOfTree(root.left);
            int b = heightOfTree(root.right);
            int c = Math.max(a,b);
            return c+1;


        }
        public int maxOfTree(TreeNode root){
            if (root==null) return Integer.MIN_VALUE;
            int a = maxOfTree(root.left);
            int b = maxOfTree(root.right);
            int c = Math.max(a,b);
            int d = Math.max(c,root.data);
            return d;
        }
        public int minOfTree(TreeNode root){
            if (root==null) return Integer.MAX_VALUE;
            int a = minOfTree(root.left);
            int b = minOfTree(root.right);
            int c = Math.min(a,b);
            int d = Math.min(c,root.data);
            return d;
        }

        public int noOfNodes(TreeNode root){
            if (root == null) return 0;
            int a = noOfNodes(root.left);
            int b = noOfNodes(root.right);
            int c = a+b+1;
            return c;
        }

        public void levelOrderTraversal(TreeNode root){
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()){
                TreeNode a = q.poll();
                System.out.print(a.data+" ");
                if (a.left!=null){
                    q.add(a.left);
                }
                if (a.right!=null){
                    q.add(a.right);
                }

            }
        }

        public void printLevel(TreeNode root,int level){
            if (root == null){
                return;
            }
            if (level == 1){
                System.out.print(root.data+" ");
            }else if(level>1){
                printLevel(root.left,level-1);
                printLevel(root.right,level-1);
            }

        }


        public void leftView(TreeNode root){

          while (root.left!=null){
              System.out.println(root.data);
              root = root.left;
          }
            System.out.println(root.data);


        }

        public void rightView(TreeNode root){

          while (root.right!=null){
              System.out.println(root.data);
              root = root.right;
          }
            System.out.println(root.data);


        }

        private int hasHeight(TreeNode root){
            if (root == null) return 0;
            int a = hasHeight(root.left);
            int b = hasHeight(root.right);
            int c = Math.max(a,b);
            return c+1;
        }

        public int diametre(TreeNode root){
            if (root == null) return 0;
            int a =  hasHeight(root.left);
            int b = hasHeight(root.right);
            return a+b+1;
        }

        public TreeNode lowestCommonAnsicstor(TreeNode root,int n1, int n2){
            if(root == null) return null;
            if (root.data == n1 || root.data == n2) return root;
            TreeNode left = lowestCommonAnsicstor(root.left,n1,n2);
            TreeNode right = lowestCommonAnsicstor(root.right,n1,n2);
            if (left == null) return right;
            if (right == null) return left;
            return root;
        }

        public boolean search(TreeNode root,int n)
        {
            if (root == null) return false;
            if (root.data == n) return true;
            if(n < root.data){
                return search(root.left,n);
            }
            return search(root.right,n);
        }

    }


public class BST {

    public static void main(String[] args) {

        Tree tree = new Tree();
        TreeNode root = new TreeNode(10);
        tree.insert(root,5);
        tree.insert(root,11);
        tree.insert(root,2);
        tree.insert(root,6);
        tree.insert(root,12);
        tree.insert(root,13);


//        tree.insert(root,1);
//        tree.insert(root,2);
//        tree.insert(root,3);
//        tree.insert(root,4);
//        tree.insert(root,5);



//        tree.inOrder(root);
//        System.out.println();
//        tree.preOrder(root);
//        System.out.println();
//        tree.postOrder(root);
//        System.out.println();
//        System.out.println(tree.heightOfTree(root));
//        System.out.println(tree.maxOfTree(root));
//        System.out.println(tree.noOfNodes(root));
//        System.out.println(tree.minOfTree(root));
//        tree.levelOrderTraversal(root);
//        for (int i = 1 ; i < tree.heightOfTree(root) ; i++){
//            tree.printLevel(root,i);
//            System.out.println();
//        }

//        tree.leftView(root);
//        tree.rightView(root);
//        System.out.println(tree.diametre(root));
//        System.out.println(tree.lowestCommonAncistor(root, 2, 2).data);
//        System.out.println(tree.search(root,2));
//        System.out.println(tree.heightOfTree(root));
//        tree.printLevel(root,3);
        System.out.println(tree.diametre(root));
    }



}
