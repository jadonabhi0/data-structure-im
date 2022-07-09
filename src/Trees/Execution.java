package Trees;

public class Execution {
    public static void main(String[] args) {
        MyTree.Node root = new MyTree.Node(10);
        MyTree tree = new MyTree();

        tree.insert(root,12);
        tree.insert(root,2);
        tree.insert(root,5);
        tree.insert(root,11);
        tree.insert(root,18);
        tree.insert(root,6);
        tree.insert(root,8);
        tree.insert(root,3);
        tree.insert(root,9);


        tree.levelOrderTraversal(root);


    }
}
