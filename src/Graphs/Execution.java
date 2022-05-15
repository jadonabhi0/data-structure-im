package Graphs;

import java.util.HashSet;

public class Execution {
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0,1,10);
        g.addEdge(0,2,40);
        g.addEdge(2,0,40);
        g.addEdge(2,3,30);
        g.addEdge(3,2,30);
        g.addEdge(3,1,20);
        g.addEdge(1,0,10);
        g.addEdge(1,3,20);
        g.display();
//        System.out.println(g.noOfEdges());
//        System.out.println(g.containsEdge(0, 3));
//

    }
}
