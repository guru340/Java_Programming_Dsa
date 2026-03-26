package Graph2.Dijiskstra;

import java.util.PriorityQueue;

import java.util.*;

class Pair implements Comparable<Pair> {
    int first;  // weight
    int second; // node

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int compareTo(Pair other) {
        return this.first - other.first;
    }
}

public class PrimsAlgorithm {
    List<List<Pair>> adj; // adjacency list

    public PrimsAlgorithm(int vertices) {
        adj = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Add undirected edge
    public void addEdge(int u, int v, int w) {
        adj.get(u).add(new Pair(w, v));
        adj.get(v).add(new Pair(w, u));
    }

    public int prim() {
        int source = 0;
        int mst = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, source));

        boolean[] visited = new boolean[adj.size()];
        Arrays.fill(visited, false);

        while (!pq.isEmpty()) {
            Pair top = pq.poll();
            int currentNode = top.second;
            int currentCost = top.first;

            if (!visited[currentNode]) {
                mst += currentCost;
                visited[currentNode] = true;

                for (Pair nei : adj.get(currentNode)) {
                    int neiNode = nei.second;
                    int weight = nei.first;
                    if (!visited[neiNode]) {
                        pq.add(new Pair(weight, neiNode));
                    }
                }
            }
        }
        return mst;
    }

    public static void main(String[] args) {
        PrimsAlgorithm g = new PrimsAlgorithm(5);

        g.addEdge(0, 1, 2);
        g.addEdge(0, 3, 6);
        g.addEdge(1, 2, 3);
        g.addEdge(1, 3, 8);
        g.addEdge(1, 4, 5);
        g.addEdge(2, 4, 7);
        g.addEdge(3, 4, 9);

        System.out.println("Total cost of MST: " + g.prim());
    }
}


