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
public class MergeSort {
    Scanner s = new Scanner(System.in);

    public void merge_sort() {
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

        mergeSort(list, 0, n - 1);

        System.out.println("Merge Sorted Output:\n");
        for (int i = 0; i < n; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println("\n");
    }

    private void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private void merge(int[] array, int left, int mid, int right) {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = array[left + i];
        }

        for (int i = 0; i < rightSize; i++) {
            rightArray[i] = array[mid + 1 + i];
        }

        int i = 0, j = 0, k = left;
        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }


}

