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



class BFS {

    Scanner s = new Scanner(System.in);

    public void bfsSort() {
        System.out.print("\nEnter the node count-->");
        int a = s.nextInt();
        System.out.print("\nEnter number of edges-->");
        int c = s.nextInt();
        Graph g = new Graph(a);
        for (int i = 0; i < c; i++) {
            System.out.print("\n Enter edges-->");
            g.addEd(s.nextInt(), s.nextInt());
        }
        System.out.print("\n starting node for travarsal-->");
        int b = s.nextInt();
        System.out.print("\nBreadth First Traversal-->");
        g.BFS(b);

    }

}

class Graph {

    private int V;
    private LinkedList<Integer> adj[];

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }


    void addEd(int v, int w) {
        adj[v].add(w);
    }


    void BFS(int s) {

        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue
                = new LinkedList<Integer>();


        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {

 
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
