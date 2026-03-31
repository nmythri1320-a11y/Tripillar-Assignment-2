package Graphs;

import java.util.*;

class GraphAdjList {
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(3);
        graph.get(1).add(4);

        graph.get(2).add(5);
        graph.get(2).add(6);

        graph.get(3).add(13);
        graph.get(3).add(15);

        graph.get(4).add(17);
        graph.get(4).add(19);


        System.out.println(graph);
    }
}
