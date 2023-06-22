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
public class BubbleSort {

    Scanner s = new Scanner(System.in);

    public void bubble_sort() {
        System.out.print("Enter the number of input you want >:");
        int n = s.nextInt();
        int temp = 0;
        int m = 1;
        System.out.println("Enter the numbers: ");
        int list[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("index{"+i+"}= ");
            list[i] = s.nextInt();
            
       
             
        }
        
        
//    System.out.println("Unsorted Output:\n");
       for(int i = 0; i< n; i++){
            System.out.print(list[i]+" " );
        }
       
        System.out.println("  ");
        
          for(int i=0; i < n; i++){ 
              System.out.print("pass " + i );
              System.out.println( " ");
             
             for(int j=1; j < (n-i); j++){ 
              
                          if(list[j-1] > list[j]){                                   //swap elements  
                                 temp = list[j-1];  
                                 list[j-1] = list[j];  
                                 list[j] = temp; 
                                 
                              
                               
                                    for( int k=0; k < n; k++){
                                    System.out.print( list[k] + " ");
                                    
                                                        
                                 
                         }  System.out.println( " ");
            
                                 
                                 
                         } 
                                  
                          
                 } 
              System.out.println( " ");
          
          
          }
          
//            System.out.println("Bubble Sorted Output:");
            for(int i = 0; i< n; i++){
            System.out.print(list[i]+" ");
        }
            System.out.println(" ");

    }

}
