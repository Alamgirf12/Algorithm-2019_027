/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm_2019_027;



import java.util.*;
/**
 *
 * @author Alamgir
 */



import java.util.*;

public class BFS {
    public static void bfs(String[][] graph, String startNode) {
        Queue<String> queue = new LinkedList<>();
        List<String> visited = new ArrayList<>();

        queue.offer(startNode);

        while (!queue.isEmpty()) {
            String currentNode = queue.poll();

            if (!visited.contains(currentNode)) {
                visited.add(currentNode);
                System.out.println(currentNode);

                int nodeIndex = currentNode.charAt(0) - 'A';
                for (int i = 1; i < graph[nodeIndex].length; i++) {
                    String neighbor = graph[nodeIndex][i];
                    if (!visited.contains(neighbor) && !queue.contains(neighbor)) {
                        queue.offer(neighbor);
                    }
                }
            }
        }
    }

    public static void bfsSort() {
        String[][] graph = {
            {"A", "B", "C"},
            {"B", "A", "D", "E"},
            {"C", "A", "F"},
            {"D", "B"},
            {"E", "B", "F"},
            {"F", "C", "E"}
        };

        String startNode = "C";

        System.out.println("BFS Traversal:");
        bfs(graph, startNode);
    }


}
