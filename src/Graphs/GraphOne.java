package Graphs;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class MyGraph{

    int vertices;
    int edges;
    ArrayList<Integer>[] adj;
    public MyGraph(int vertices, int edges){
        this.edges = edges;
        this.vertices = vertices;
        adj = new ArrayList[vertices];

        for(int i =0 ; i < vertices ; i++){
            adj[i] = new ArrayList<>();
        }

    }

    public void addEdge(int src, int dest){
        adj[src].add(dest);
        adj[dest].add(src);
    }

    public void printGraph(){
        int c = 0;
        for (ArrayList<Integer> a : adj){
            System.out.print(c+++" --> ");
            System.out.print(a);
            System.out.println();
        }
    }

    public void bfs(int src){
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[src] = true;
        queue.add(src);
        while (!queue.isEmpty()){
            int n = queue.poll();
            System.out.print(n+" ");
            for (int i : adj[n]){
                if (!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        System.out.println();
    }

    public void dfs(int src){
        boolean[] visites = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();
        visites[src] = true;
        stack.add(src);
        while (!stack.isEmpty()){
            int n = stack.pop();
            System.out.print(n+" ");
            for (int i : adj[n]){
                if (!visites[i]){
                    visites[i] = true;
                    stack.add(i);
                }
            }
        }
        System.out.println();
    }


}



public class GraphOne {


    public static void main(String[] args) {
        MyGraph graph = new MyGraph(4,4);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(2,3);

//        graph.printGraph();
        graph.bfs(1);
        graph.dfs(1);
    }
}
