package com.app;

/**
 * Created by s.mayank on 21/10/16.
 * This is implementation of a min heap
 * best case : when array is already sorted :  O(n(logn))
 * worst case : when array is sorted in reverse order : O(n(logn))
 */
public class HeapSort {
    public void sort(int[] a){
        int n = a.length;
        // arrangement in heap
        for(int i = a.length/2 -1; i >= 0 ; i--){
            heapify(a, n , i);
        }
        // get the elements from heap
        for(int i = a.length-1; i>=0; i--){
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a, i, 0);
        }
    }

    public void heapify(int[] a, int n , int i){
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;

        if(l < n && a[l] > a[largest]){
            largest = l;
        }
        if(r < n && a[r] > a[largest]){
            largest = r;
        }

        if(largest != i){
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;

            heapify(a, n, largest);
        }
    }
}
