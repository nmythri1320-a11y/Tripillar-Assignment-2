package Graphs;

import java.util.*;

public class CountVE {
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(0).add(2);
        graph.get(2).add(0);

        int edges = 0;

        for (ArrayList<Integer> list : graph)
            edges += list.size();

        System.out.println("Vertices: " + V);
        System.out.println("Edges: " + edges / 2);
    }
}
