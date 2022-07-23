
import java.util.Scanner;

public class TreePractice {

    //Tree is a non-linear data structure which organises data in an hierarchical structure and this is a recursive
    // definition.
    // a tree is a connected graph without any circuits.
    //if in a graph there is one and only
    // a graph has a closed loop cannot be a tree.
    //properties
    /*
     * 1. there is one and oly one path between every pair of vertices in a tree.
     * 2. a tree with n vertices has exactly n-1 edges.
     * 3. a graph is a tree if and only if it is minimally connected.
     * 4. a connected graph with n vertices and n-1 edges.
     *
     * ROOT: the first noe from where the tree originates is called as a root node. node A is the only root node.
     * EDGE- the connecting link between any two nodes is called as an edge.
     * PARENT - the node which has a branch from it to any other node is called a parent node. The node which has one or more children is called as a parent node. In a tree,
     *
     * CHILD- The node which is a descendant of some node is called as a child node. All the nodes are child nodes.
     * SIBLINGS- nodes which belong to the same parent are called siblings. Nodes with same parent are sibling nodes.
     * DEGREE- degree of a node is the total number of children of that node.
     * degree of a tree is the highest degree of a node among all the nodes in the tree.
     * INTERNAL NODE- the node has at least one child is called as an internal node.  Internal nodes are called as non terminal nodes. Every non leaf node is an internal node.
     * LEAF NODE- the node which does not have any child is called as a leaf node. Leaf  nodes are also called as external nodes or terminal nodes.
     * LEVEL- Ina tree each step from top to bottom is called as level of a tree. The level count starts with 0 by default and increments by 1 at each level or step.
     * HEIGHT-  Total number of edges that lies on the longest path from any leaf node to a particular node is called as height of that node.
     * height of a tree is the height of root node.
     * height of all leaf nodes = 0.
     * DEPTH- total no. of edges from root node to a particular node is called as depth of that node.
     * Depth of a tree is the total number of edges from root node to a leaf node in the longest path.
     * Depth of root node = 0.
     * SUBTREE- in a tree each child from a node froms a sub-tree recursively
     * every child node forms a sub-tree on its parent node.
     * BINARY TREE- it is a special tree data structure in which each node can have at most 2 children.
     * thus, in a binary tree each node has either
     *
     * Unlabeled Binary Tree- A binary tree is unlabeled if its nodes are not assigned any label
     * Formula- (2nCn/nplus1)n!
     *
     * it is a non linear data structure used for storing the data.
     * it is made up of nodes and edges without having a cycle.
     * */

    static Scanner sc =null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        TreeNode root = createNode();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();

    }


    static TreeNode createNode(){
        TreeNode root = null;
        System.out.println("Enter Data : ");
        int data = sc.nextInt();
        if (data == -1){return null;}
        root = new TreeNode(data);
        System.out.println("Enter data for left : " + data);
        root.left = createNode();
        System.out.println("Enter data for right : " + data);
        root.right = createNode();
        return root;


    }


    static void inOrder(TreeNode root){
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void preOrder(TreeNode root){
        if(root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(TreeNode root){
        if(root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }



}

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }
}