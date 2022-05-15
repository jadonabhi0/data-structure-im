package Graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class MyGraphMonu {
    HashMap<Integer,HashMap<Integer,Integer>> map ;

    public MyGraphMonu(int v){
        map = new HashMap<>();
        for (int i = 0 ; i < v ; i++) {
            map.put(i, new HashMap<>());
        }
    }


    public void addEdge(int v1, int v2, int cost){
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public boolean containsEdge(int v1, int v2){
        return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);
    }

    public int noOfEdge(){
        int sum = 0 ;
        for(int key : map.keySet()){
            sum += map.get(key).size();
        }
        return sum/2;
    }

    public void removeEdge(int v1, int v2){
        if (containsEdge(v1,v2)) {
            map.get(v1).remove(v2);
            map.get(v2).remove(v1);
        }
    }

    public void removeVertex(int v){
        for (int key: map.get(v).keySet()){
            map.get(key).remove(v);
        }
        map.remove(v);
    }

    public void display(){
        for (int key : map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
    }


    public boolean hasPath(int src, int des, HashSet<Integer> visited){
        if (src == des){
            return true;
        }
        visited.add(src);
        for (int key : map.get(src).keySet()){
            if (!visited.contains(key)){
                boolean path = hasPath(key, des, visited);
                if (path){
                    return path;
                }
            }

        }
        visited.remove(src);
        return false;
    }

    public void printPath(int src, int des, HashSet<Integer> visited, String s){
        if (src == des){
            System.out.println(s+des);
            return ;
        }
        visited.add(src);
        for (int key : map.get(src).keySet()){
            if (!visited.contains(key)){
                 printPath(key, des, visited,s+src+" ");

            }

        }
        visited.remove(src);
        return ;
    }



    public boolean BFS(int src, int dis) {

        LinkedList<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        queue.add(src);
        while (!queue.isEmpty()) {
            // remove
            int rv = queue.remove();
            // Ignore
            if (visited.contains(rv)) {
                continue;
            }

            // visited Mark
            visited.add(rv);

            // check src==dis
            if (rv == dis) {
                return true;
            }

            // add nbrs
            for (int key : map.get(rv).keySet()) {
                if (!visited.contains(key)) {
                    queue.add(key);
                }
            }

        }
        return false;
    }


    public boolean DFS(int src, int dis) {

        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        st.push(src);
        while (!st.isEmpty()) {
            // remove
            int rv = st.pop();
            // Ignore
            if (visited.contains(rv)) {
                continue;
            }

            // visited Mark
            visited.add(rv);

            // check src==dis
            if (rv == dis) {
                return true;
            }

            // add nbrs
            for (int key : map.get(rv).keySet()) {
                if (!visited.contains(key)) {
                    st.push(key);
                }
            }

        }
        return false;
    }






}
