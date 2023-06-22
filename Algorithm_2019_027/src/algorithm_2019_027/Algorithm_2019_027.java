/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm_2019_027;

import java.util.Scanner;

/**
 *
 * @author Alamgir
 */
public class Algorithm_2019_027 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("=========== (Algorithm) ==========");
        System.out.println(" 1) Data Structure \n 2) Algorithms");
        System.out.print("Enter your choice:> ");
        int choice = s.nextInt();
        System.out.println("===================================");

        if (choice == 1) {
            System.out.println("=========== (Data Structure) ==========");
            System.out.println(" 01.Bubble sort \n 02.Insertion sort \n 03.Selection sort \n "
                    + "04.Marge sort \n 05.Quick sort \n 06.Counting sort \n "
                    + "07.Radix sort \n 08.Heap sort \n 09.Bin sort \n "
                    + "10.Shell sort \n 11.Linear search \n 12.Bimary search \n "
                    + "13.Euclidean GCD Algorithm \n 14.Universal hashing \n 15.Stack \n "
                    + "16.Queue \n 17.Linked List \n 18.Fibonacci Numbers \n 19.Recurrence");
            System.out.print("Enter your choice:> ");
            int c1 = s.nextInt();

            switch (c1) {
                case 1:
                    BubbleSort b = new BubbleSort();
                    b.bubble_sort();
                    break;
                case 2:
                     InsertionSort Insort = new InsertionSort();
                    Insort.insertion_sort();
                    break;
                case 3:
                    SelectionSort Ssort = new SelectionSort();
                    Ssort.selection_sort();
                    break;
                case 4:
                     MergeSort Msort = new MergeSort();
                    Msort.merge_sort();
                    break;
                case 5:
                     QuickSort Qsort = new QuickSort();
                    Qsort.quick_sort();
                    break;
                case 6:
                     SelectionSort Csort = new SelectionSort();
                    Csort.selection_sort();
                    break;
                case 7:
                     SelectionSort Radixsort = new SelectionSort();
                    Radixsort.selection_sort();
                    break;
                case 8:
                     SelectionSort Heapsort = new SelectionSort();
                    Heapsort.selection_sort();
                    break;
                case 9:
                     SelectionSort Binsort = new SelectionSort();
                    Binsort.selection_sort();
                    break;
                case 10:
                     SelectionSort Shellsort = new SelectionSort();
                    Shellsort.selection_sort();
                    break;
                case 11:
                     SelectionSort LSearch = new SelectionSort();
                    LSearch.selection_sort();
                    break;
                case 12:
                     SelectionSort BSearch = new SelectionSort();
                    BSearch.selection_sort();
                    break;
                case 13:
                     SelectionSort Gcd = new SelectionSort();
                    Gcd.selection_sort();
                    break;
                case 14:
                     SelectionSort hashing = new SelectionSort();
                    hashing.selection_sort();
                    break;
                case 15:
                     SelectionSort stack  = new SelectionSort();
                    stack.selection_sort();
                    break;
                case 16:
                     SelectionSort queue = new SelectionSort();
                    queue.selection_sort();
                    break;
                case 17:
                     SelectionSort Llist = new SelectionSort();
                    Llist.selection_sort();
                    break;
                case 18: SelectionSort Fbnumber = new SelectionSort();
                    Fbnumber.selection_sort();
                    break;
                    
                case 19:
                     SelectionSort Recurrence = new SelectionSort();
                    Recurrence.selection_sort();
                    break;
                default:
                    break;

            }
        } else if (choice == 2) {
            System.out.println("=========== (Algorithm) ==========");
    System.out.println(" 01.Largest common subsequence \n 02.BFS \n 03.Bellman ford's algorithm \n "
                    + "04.Dijkastra's algorithm \n 05.Krushkal's algorithm  \n 06. \n "
                    + "07.Optimal Binary Search Tree \n 08. Knapsack problem\n 09.Prim's algorithm  \n "
                    + "10.Warshall's algorithm //incompleted \n 11.Topological sort \n 12.Longest increasing subsequence \n "
                    + "13.Naive string matching algorithm\n 14.DAG \n 15.Matrix chain multiplication \n "
                   );
            System.out.print("Enter your choice:> ");
            int c1 = s.nextInt();

            switch (c1) {
                case 1:
                    
                    LCS lcs = new LCS();
                        lcs.run();
               
                    break;
                case 2:
                  BFS bfs = new BFS();
                  bfs.bfsSort();
                    break;
                case 3:
                     BellmanFord bf = new BellmanFord();
                        bf.run();
                    break;
                case 4:
                     Dijkstra djk = new Dijkstra(5);
                        djk.run();
                    break;
                case 5:
                    Krushkal krs = new Krushkal();
                        krs.run();
                    break;
                case 6:
              

                    break;
                case 7:
                     OBST obst = new OBST();
                        obst.run();
                    break;
                case 8:
                     KnapSack kns = new KnapSack();
                        kns.runKnapSack();
                    break;
                case 9:
                     Prims prims = new Prims();
                        prims.run();
                    break;
                case 10:
                     
                    break;
                case 11:
                      TopologicalSort tps = new TopologicalSort();
                        tps.topological_sort();
                    break;
                case 12:
                      LIS lis = new LIS();
                lis.run();
                    break;
                case 13:
                       StringMatching Matching = new StringMatching();
                String pat = "NNMMNMMYYMDDJDDBFHSJEEEEE";
                String txt = "MMNMMYY";
                Matching.run(pat, txt);
                    break;
                case 14:
                     DAG dag = new DAG();
                    dag.run();
                    break;
                case 15:
                    MatrixChain mc = new MatrixChain();
                mc.run();
                    break;
                case 16:
                    
                    break;
                case 17:
                    break;
                case 18:
                    break;
                case 19:
                    break;
                case 20:
                    break;
                default:
                    break;
            }

        } else {
            System.out.println("Invalid");
        }

    }

}