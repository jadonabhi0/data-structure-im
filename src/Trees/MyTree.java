package Trees;


import java.util.*;


public class MyTree {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }

        public Node(){}
    }



    private Node root;


    public MyTree(){
        this.root = null;
    }

    public Node insert(Node root ,int data){
        if (root == null) root = new Node(data);
        else if(root.data > data){
            root.left = insert(root.left,data);
        }else{
            root.right = insert(root.right,data);
        }
        return root;
    }


    public void inOrder(Node root){
        if (root == null) return;
        inOrder(root.left);
        System.out.print( root.data+" ");
        inOrder(root.right);
    }

    public void preOrder(Node root){
        if (root == null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public void postOrder(Node root){
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }


    public int heightOfTree(Node root){
        if (root == null) return 0;
        int a = heightOfTree(root.left);
        int b = heightOfTree(root.right);
        int c = Math.max(a,b);
        return c+1;
    }

    public int maxOfTree(Node root){
        if (root.right == null) return root.data;
        return maxOfTree(root.right);
    }

    public int minOfTree(Node root){
        if (root.left == null){
            return  root.data;
        }
        return  minOfTree(root.left);
    }

    public boolean search(Node root, int data){
        if (root == null) return false;
        if (root.data == data) return true;
        if (data < root.data){
           search(root.left,data);
        }
       return search(root.right,data);
    }

    public int noOfNodes(Node root){
        if (root == null) return 0;
        return noOfNodes(root.left) + noOfNodes(root.right)+1;
    }

    public void levelOrderTraversal(Node root){
        if (root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        while (!q.isEmpty()){
            Node a = q.poll();
            if(a != null){
                System.out.print(a.data+" ");
                if (a.left != null){
                    q.offer(a.left);
                }
                if (a.right != null){
                    q.offer(a.right);
                }

            }
            else {
                System.out.println();
                if (q.isEmpty()){
                    break;
                }else{
                    q.offer(null);
                }
            }
        }

    }


    public int sumOfNodes(Node root){
        if (root == null) return 0;
        int s1 = sumOfNodes(root.left);
        int s2 = sumOfNodes(root.right);
        return s1 + s2 + root.data;
    }

    public int diameterON2(Node root){
        if (root == null) return 0;
        int d1 = diameterON2(root.left);
        int d2 = diameterON2(root.right);
        int d3 = heightOfTree(root.left) + heightOfTree(root.right) +1;
        return Math.max(Math.max(d1,d2),d3);
    }

    static class TreeInfo{
        int ht;
        int dia;
        TreeInfo(int ht , int dia){
            this.dia = dia;
            this.ht = ht;
        }
    }


    public TreeInfo diametreON(Node root){

        if (root == null) return new TreeInfo(0,0);
        TreeInfo left = diametreON(root.left);
        TreeInfo right = diametreON(root.right);

        int fht = Math.max(left.ht,right.ht) + 1;

        int d1 = left.dia;
        int d2 = right.dia;
        int d3 = left.ht + right.ht + 1;

        int fdia = Math.max(Math.max(d1,d2),d3);

        TreeInfo info = new TreeInfo(fht,fdia);
        return info;
    }

    private List<List<Integer>> zicZac(Node root, int level,List<List<Integer>> list){
            if (root == null) return list;
            if (list.size() <= level){
                List<Integer> l = new LinkedList<>();
                list.add(l);
            }
            if (level % 2 == 0){
                list.get(level).add(root.data);
            }
            else{
                list.get(level).add(0,root.data);
            }
            zicZac(root.left,level+1,list);
            zicZac(root.right,level+1,list);
            return list; 
    }

    public void zicZacTrav(Node root){
        List<List<Integer>> list = new LinkedList<>();
       list = zicZac(root,0,list);
        for (List<Integer> li:list
             ) {
            System.out.println(li);
        }
    }

    private boolean isIdentical(Node root, Node subRoot){
        if (root == null && subRoot == null){
            return true;
        }

        if (root == null || subRoot == null){
            return false;
        }

        if (root.data == subRoot.data){
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }

        return  false;
    }

    public boolean isSubTree(Node root, Node subRoot){
        if (subRoot == null){
            return true;
        }

        if (root == null){
            return false;
        }

        if (root.data == subRoot.data){
            if (isIdentical(root ,subRoot)) {
                return true;
            }
        }

        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    public void getLevel(Node root, int level){

        if (root == null) {
            return;
        }
        if (level == 0){
            System.out.print(root.data+" ");
        }
        else if(level > 0){
            getLevel(root.left,level-1);
            getLevel(root.right,level-1);
        }
    }

    int sum = 0;
    private int levelSum(Node root, int level){
        if (root == null) return 0;
        if (level == 0){
            sum +=  root.data;
        }
        else if(level > 0){
            levelSum(root.left,level-1);
            levelSum(root.right,level-1);
        }
        return sum;

    }

    public void getLevelSum(Node root , int level){
        System.out.println(levelSum(root, level));
    }

    private void leftView(Node root, LinkedList<Node> list, int level){
        if (root == null) return ;
        if (list.size() == level){
            list.add(root);
        }
        leftView(root.left, list, level+1);
        leftView(root.right,list,level+1);

    }

    public void getLeftView(Node root){
        LinkedList<Node> list = new LinkedList<>();
        leftView(root,list,0);
        for (Node i : list){
            System.out.println(i.data);
        }
    }

    private void rightView(Node root, List<Node> list , int level){
        if (root == null) return;
        if (list.size() == level){
            list.add(root);
        }
        rightView(root.right,list, level+1);
        rightView(root.left,list, level+1);
    }

    public void getRightView(Node root){
        ArrayList<Node> list = new ArrayList<>();
        rightView(root,list,0);
        for(Node i : list){
            System.out.println(i.data);
        }
    }

    static int MAX = Integer.MIN_VALUE;
    public int maxOfLevel(Node root, int level){
        if (root == null) return 0;
        if (level == 0){
           MAX = Math.max(MAX,root.data);
        }
        if (level > 0){
            maxOfLevel(root.left,level-1);
            maxOfLevel(root.right,level-1);
        }
        return MAX;
    }

    static int MIN = Integer.MAX_VALUE;
    public int minOfLevel(Node root, int level){
        if (root == null) return 0;
        if (level == 0){
            MIN = Math.min(MIN,root.data);
        }
        if (level > 0){
            minOfLevel(root.left,level-1);
            minOfLevel(root.right,level-1);
        }
        return MIN;
    }


    private int max(Node node){
        if (node.right != null){
             return max(node.right);
        }
        else {
            return node.data;
        }
    }

    public Node delete(Node root, int data){
        if (root == null) return  null;

        if (data > root.data){
            root.right = delete(root.right, data);
        }
        else if(data < root.data){
            root.left = delete(root.left, data);
        }
        else{
            if(root.left != null && root.right != null){
                int lmax = max(root.left);
                root.data = lmax;
                root.left = delete(root.left,lmax);
                return root;
            }
            else if(root.right != null){
                return root.right;
            }
            else if(root.left != null){
                return root.left;
            }
            else{
                return null;
            }
        }
        return root;
    }



//----------------------------------------------------------------------------------------------------------------------

    private void path(Node root, String path){
        if (root == null){
            return;
        }

       if (root.right == null && root.left == null){
           System.out.println(path+root.data);
           return;
       }

        path(root.left,path+root.data+" ");
        path(root.right, path+root.data+" ");

    }

    public void pathToLeaf(Node root){
        if (root == null){
           return;
        }
        path(root,"");
    }

    private boolean checkBst(Node root, int start, int end){
        if (root == null) return true;
        if (root.data > start && root.data < end){
            return checkBst(root.left,start,root.data) && checkBst(root.right,root.data,end);

        }
        return false;
    }

    public boolean isBst(Node root){
        if (root == null) return true;
        return checkBst(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }


    public Node lowestCommonAncistor1(Node root, int key1, int key2){
        if (root == null) return null;
        if (root.data == key1 || root.data == key2){
            return root;
        }

        Node left = lowestCommonAncistor1(root.left, key1, key2);
        Node right = lowestCommonAncistor1(root.right, key1, key2);

        if (left == null) return right;
        if (right == null) return left;

        return root;

    }


    public Node lowestCommonAncistor2(Node root, int key1, int key2){
        if(key1 < root.data && key2 < root.data){
            return lowestCommonAncistor2(root.left,key1,key2);
        }
        else if(key1 > root.data && key2 > root.data){
            return lowestCommonAncistor2(root.right, key1, key2);
        }
        else {
            return root;
        }
    }



    public boolean isSameTree(Node p, Node q) {
        if( p == null && q == null){
            return true;
        }
        if( p == null || q == null){
            return false;
        }

        if (p.data != q.data){
            return false;
        }

        return isSameTree(p.left,q.right) && isSameTree(p.right, q.right);

    }


    static class BalancePair{
        int ht = -1;
        boolean isbal = true ;
    }

    private BalancePair isBalanced(Node root){
        if (root == null) return  new BalancePair();

        BalancePair lbp = isBalanced(root.left);
        BalancePair rbp = isBalanced(root.right);
        BalancePair sbp = new BalancePair();
        sbp.ht = Math.max(lbp.ht , rbp.ht) +1;
        boolean sb = Math.abs(lbp.ht - rbp.ht) <= 1;
        sbp.isbal = sb && lbp.isbal && rbp.isbal;
        return sbp;
    }

    public boolean isBalance(Node root){
        return isBalanced(root).isbal;
    }

    static class Pair{
        int hd;
        Node node;

        public Pair(int hd, Node node){
            this.hd = hd;
            this.node = node;
        }
    }


    public ArrayList<Integer> topView(Node root){
        Queue<Pair> q = new ArrayDeque<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();

        q.add(new Pair(0,root));

        while (!q.isEmpty()){
            Pair cur = q.poll();
            if (!map.containsKey(cur.hd)){
                map.put(cur.hd, cur.node.data);
            }

            if (cur.node.left != null){
                q.add(new Pair(cur.hd-1, cur.node.left));
            }

            if (cur.node.right != null){
                q.add(new Pair(cur.hd+1, cur.node.right));
            }

        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> m : map.entrySet()){
            ans.add(m.getValue());
        }
        return ans;
    }



}
