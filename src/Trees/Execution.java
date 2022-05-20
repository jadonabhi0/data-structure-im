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

//        tree.inOrder(root);
//        System.out.println();
//        tree.preOrder(root);
//        System.out.println();
//        tree.postOrder(root);
//        System.out.println(tree.isBalance(root));
            tree.levelOrderTraversal(root);
        System.out.println(tree.topView(root));

    }
}
