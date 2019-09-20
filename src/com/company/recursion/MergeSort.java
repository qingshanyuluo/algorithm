package com.company.recursion;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = {3, 4, 2, 34, 4, 3432, 32};
        sort(a, 0, a.length);
        System.out.println(a);
    }

    private static void sort(int[] arr, int s, int e) {
        if (s == e-1) {

        } else {
            int mid = (s + e) >> 1;
            sort(arr, s, mid);
            sort(arr, mid, e);
            merge(arr, s, e);
        }
    }

    private static void merge(int[] arr, int s, int e) {
        //略难且复杂，，手写几乎不可能一步完成
        int mid = (s + e) >> 1;
        int[] res = new int[arr.length];
        int f = s;
        int t = s;
        while (f < ((s + e) >> 1) && mid < e) {
            if (arr[f] <= arr[mid]) {
                res[t] = arr[f];
                f++;
            } else {
                res[t] = arr[mid];
                mid++;
            }
            t++;
        }
        while (f < ((s + e) >> 1)) {
            res[t] = arr[f];
            f++;
            t++;
        }
        while (mid < e) {
            res[t] = arr[mid];
            mid++;
            t++;
        }
        if (e - s >= 0) System.arraycopy(res, s, arr, s, e - s);
    }
}
