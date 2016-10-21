package com.app;

/**
 * Created by s.mayank on 21/10/16.
 * it's again a divide and conquer sort.
 * best case : when pivot point is selected in mid :  O(n(logn))
 * worst case : when pivot point is selected at corner : O(n2)
 */
public class QuickSort {
    int[] array;
    public void sort(int[] a){
        array = a;
        doQuickSort(0, a.length-1);
    }

    public void doQuickSort(int lower, int higher){
        int i = lower;
        int j = higher;
        while(i <= j){
            int mid = (lower+higher)/2;
            int pivot = array[mid];

            while(array[i] < pivot){
                i++;
            }
            while(array[j] > pivot){
                j--;
            }
            if(i <= j){
                excahge(i, j);
                i++;
                j--;
            }
        }

        if(i <= higher){
            doQuickSort(i, higher);
        }
        if(lower <= j){
            doQuickSort(lower, j);
        }
    }

    public void excahge(int lower, int higher){
        int temp = array[lower];
        array[lower] = array[higher];
        array[higher] = temp;
    }
}
