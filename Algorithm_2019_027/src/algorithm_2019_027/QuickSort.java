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

public class QuickSort {
    Scanner s = new Scanner(System.in);

    public void quick_sort() {
        System.out.print("Enter the number of inputs you want: ");
        int n = s.nextInt();
        System.out.println("Enter the numbers: ");
        int list[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("index{" + i + "}= ");
            list[i] = s.nextInt();
        }

        System.out.println("Unsorted Output:\n");
        for (int i = 0; i < n; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println("\n");

        quickSort(list, 0, n - 1);

        System.out.println(" Quick sorted Output:\n");
        for (int i = 0; i < n; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println("\n");
    }

    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}

