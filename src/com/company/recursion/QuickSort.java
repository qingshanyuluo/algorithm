package com.company.recursion;

import com.company.Main;

public class QuickSort {
    private static int base;
    private static int left;
    private static int right;

    public static void main(String[] args) {
        int[] a = {3, 4, 3, 43, 53, 3, 52, 33};
//        int[] a = {3, 4, 3};
//        System.out.println(divide(a, 0, a.length));
//        divide(a, 0 ,a.length);
        sort(a, 0, a.length);
        System.out.println(a);
    }

    public static void sort(int[] arr, int s, int e) {
        if (e - s <= 1) {
        } else {
            int mid = divide(arr, s, e);
            sort(arr, s, mid);
            sort(arr, mid + 1, e);
        }
    }

    private static int divide(int[] arr, int s, int e) {
        /*
        z主要作用，交换来交换去，把第一个数挪到一个位置使他左边的都比他小，右边的都比他大，
        然鹅，，思路本身简单来说就是一下从左边找，一下从右边找，一但不合格，马上交换一下使他变合格，
        然鹅，，代码乱死人，这一段，调了很久才行，但代码本身思路
        * */
        //略难且复杂，，手写几乎不可能一步完成
        base = arr[s];
        right = e;
        right--;
        left = s;
        while (left < right) {
            while (arr[right] > base) {
                right--;
            }
            swap(arr, right, left);
            if (left >= right) {
                break;
            }
            while (arr[left] < base) {
                left++;
            }
            swap(arr, right, left);
            if (arr[right] == arr[left]) {
                break;
            }
        }
        return left;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
