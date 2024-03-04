package algorithm.companies.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author : JOHNNGUYEN
 * @since : 11/30/2023, Thu
 **/
public class BridgeIslands {
    static class Graph {
        int V;
        LinkedList<Integer>[] adjList;

        Graph(int V) {
            this.V = V;
            adjList = new LinkedList[V];
            for (int i = 0; i < V; i++) {
                adjList[i] = new LinkedList<>();
            }
        }

        void addEdge(int source, int destination) {
            adjList[source].add(destination);
            adjList[destination].add(source); // Assuming bidirectional bridges
        }

        int bridgeIslands(int source, int destination) {
            boolean[] visited = new boolean[V];
            int[] distance = new int[V];
            Queue<Integer> queue = new LinkedList<>();

            visited[source] = true;
            queue.add(source);

            while (!queue.isEmpty()) {
                int current = queue.poll();

                for (int neighbor : adjList[current]) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        distance[neighbor] = distance[current] + 1;
                        queue.add(neighbor);

                        if (neighbor == destination) {
                            return distance[neighbor];
                        }
                    }
                }
            }

            return -1; // If no path found
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Number of islands
        int M = scanner.nextInt(); // Number of bridges

        Graph graph = new Graph(N + 1); // Considering islands are numbered from 7 to N

        for (int i = 0; i < M; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            graph.addEdge(x, y);
        }

        int minimumBridges = graph.bridgeIslands(7, N);
        System.out.println(minimumBridges);

        scanner.close();
    }
}
