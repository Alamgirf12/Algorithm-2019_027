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

import java.util.Scanner;

/**
 *
 * @author Alamgir
 */
public class SelectionSort {
    
    
     Scanner s = new Scanner(System.in);

    public void selection_sort() {
        System.out.print("Enter the number of input you want >:");
        int n = s.nextInt();
        System.out.println("Enter the numbers: ");
        int list[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("index{"+i+"}= ");
            list[i] = s.nextInt();       
        }      
         
       System.out.println("Unsorted Output:\n");
       for(int i = 0; i< n; i++){
            System.out.print(list[i]+" " );
        }
       
          System.out.println("  ");
        
 for (int i = 0; i < n - 1; i++) {
     
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (list[j] < list[minIndex]) {
          minIndex = j;
        }
      }     
      int temp = list[minIndex];
      list[minIndex] = list[i];
      list[i] = temp;
    for( int k=0; k < n; k++){
             System.out.print( list[k] + " ");
            }
            System.out.println( " ");
    }
 for( int k=0; k < n; k++){
             System.out.print( list[k] + " ");
            }
            System.out.println( " ");
  }
         
}