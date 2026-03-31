package Graphs;

import java.util.*;

public class BFS {

    void bfs(ArrayList<ArrayList<Integer>> g, int start) {
        boolean[] visited = new boolean[g.size()];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int v = q.poll();
            System.out.print(v + " ");

            for (int n : g.get(v)) {
                if (!visited[n]) {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Initialize graph
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges (undirected)
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(0);
        graph.get(1).add(3);
        graph.get(2).add(0);
        graph.get(2).add(4);

        BFS obj = new BFS();
        obj.bfs(graph, 0); // start BFS from node 0
    }
}
