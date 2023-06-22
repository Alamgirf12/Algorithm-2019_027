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
public class InsertionSort {
     Scanner s = new Scanner(System.in);

    public void insertion_sort() {
        System.out.print("Enter the number of input you want >:");
        int n = s.nextInt();
        int j,temp;
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
        
          for(int i=0; i < n; i++){ 
              System.out.print("pass " + i );
              System.out.println( " ");
  
            j = i;
 
            while (j > 0 && list[j] < list[j-1]) {
                temp = list[j];
                list[j] = list[j-1];
                list [j-1] = temp;
                j--;
                
            
            
            for( int k=0; k < n; k++){
             System.out.print( list[k] + " ");
            }
            System.out.println( " ");
   } 
          }
 } 
 }

