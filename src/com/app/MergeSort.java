package com.app;

/**
 * Created by s.mayank on 21/10/16.
 * Merge sort is divide and conquer sort.
 * best case : when array is already sorted :  O(n(logn))
 * worst case : when array is sorted in reverse order : O(n(logn))
 */
public class MergeSort {
    int[] temp;
    int[] array;

    public void sort(int[] a){
        int length = a.length;
        array = a;
        temp = new int[length];
        doMergerSort(0, a.length-1);
    }

    public void doMergerSort(int lower, int higher) {
        if (lower < higher) {
            int mid = (lower + higher) / 2;
            doMergerSort(lower, mid);
            doMergerSort(mid + 1, higher);
            doMergePart(lower, mid, higher);
        }
    }

    public void doMergePart(int lower, int mid, int higher){
        for(int i = 0 ;i < array.length; i++){
            temp[i] = array[i];
        }

        int lpos = lower;
        int rpos = mid+1;
        int pos = lower;

        while(lpos <= mid && rpos <= higher){
            if(temp[lpos] < temp[rpos]){
                array[pos++] = temp[lpos++];
            }else{
                array[pos++] = temp[rpos++];
            }
        }

        while(lpos <= mid){
            array[pos++] = temp[lpos++];
        }

        while(rpos <= higher){
            array[pos++] = temp[rpos++];
        }
    }
}
