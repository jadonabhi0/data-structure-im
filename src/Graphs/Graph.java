package Graphs;

import java.util.HashMap;
import java.util.Map;



public class Graph {

    HashMap<Integer, HashMap<Integer, Integer>> map;
    public Graph(int v){
        map = new HashMap<>();
        for(int i = 0 ; i < v ;i++){
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }

    
    
    public void display(){
        for (int key : map.keySet()){
            System.out.println(key+ " -> "+map.get(key));
        }
    }

    public boolean containsEdge(int v1, int v2){
        return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);
    }

    public int noOfEdges(){
        int sum = 0;
        for (int key : map.keySet()){
            sum += map.get(key).size();
        }
        return sum/2;
    }


}
