/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm_2019_027;

/**
 *
 * @author Alamgir
 */
import java.util.*;

public class DFS {
    public static void dfs(String[][] graph, String startNode) {
        Stack<String> stack = new Stack<>();
        List<String> visited = new ArrayList<>();

        stack.push(startNode);

        while (!stack.isEmpty()) {
            String currentNode = stack.pop();

            if (!visited.contains(currentNode)) {
                visited.add(currentNode);
                System.out.println(currentNode);

                int nodeIndex = currentNode.charAt(0) - 'A';
                for (int i = graph[nodeIndex].length - 1; i >= 1; i--) {
                    String neighbor = graph[nodeIndex][i];
                    if (!visited.contains(neighbor) && !stack.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }

    public static void dfsSort() {
        String[][] graph = {
            {"A", "B", "C"},
            {"B", "A", "D", "E"},
            {"C", "A", "F"},
            {"D", "B"},
            {"E", "B", "F"},
            {"F", "C", "E"}
        };

        String startNode = "B";

        System.out.println("DFS Traversal:");
        dfs(graph, startNode);
    }

 
}
