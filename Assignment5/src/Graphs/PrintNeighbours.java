package Graphs;

import java.util.*;

class PrintNeighbors {
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(0).add(2);

        int node = 0;

        System.out.println("Neighbors: " + graph.get(node));
    }
}
