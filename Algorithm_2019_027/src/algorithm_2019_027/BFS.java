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



public class BFS {
    public static void bfs(Map<String, List<String>> graph, String startNode) {
        Queue<String> queue = new LinkedList<>();
        List<String> visited = new ArrayList<>();

        queue.offer(startNode);

        while (!queue.isEmpty()) {
            String currentNode = queue.poll();

            if (!visited.contains(currentNode)) {
                visited.add(currentNode);
                System.out.println(currentNode);

                List<String> neighbors = graph.get(currentNode);
                for (String neighbor : neighbors) {
                    if (!visited.contains(neighbor) && !queue.contains(neighbor)) {
                        queue.offer(neighbor);
                    }
                }
            }
        }
    }

     public static void  bfsSort() {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("A", "D", "E"));
        graph.put("C", Arrays.asList("A", "F"));
        graph.put("D", Collections.singletonList("B"));
        graph.put("E", Arrays.asList("B", "F"));
        graph.put("F", Arrays.asList("C", "E"));

        String startNode = "A";

        System.out.println("BFS Traversal:");
        bfs(graph, startNode);
    }
}
