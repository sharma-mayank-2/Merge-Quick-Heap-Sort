package com.app;

/**
 * Created by s.mayank on 21/10/16.
 */
public class Lesson1 {
    static int[] a = {2,0,9,-1,20,-100};
    public static void main(String[] args){
        System.out.println("calling a Merge Sort");
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(a);
        for(int x : a){
            System.out.print(x+" ");
        }

        System.out.println();

        System.out.println("calling a quick sort");
        QuickSort quickSort = new QuickSort();
        quickSort.sort(a);
        for(int x : a){
            System.out.print(x+" ");
        }
        System.out.println();

        System.out.println("calling a heap sort");
        HeapSort heapSort = new HeapSort();
        heapSort.sort(a);
        for(int x : a){
            System.out.print(x+" ");
        }
    }
}
