package com.company.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FullyArrange {

    public static void main(String[] args) {
        Integer[] d = {1, 2, 3, 4};
//        List<Comparable> data = Arrays.asList(d);
        List<Integer> data = Arrays.asList(d);
        System.out.println(getFullyArrange(data));
    }

    public static <T extends Comparable> List<List<T>> getFullyArrange(List<T> data) {
        List<List<T>> res = new ArrayList<>();
        getArrange(data, 0, data.size(), res);
        return res;
    }

    private static <T extends Comparable> void getArrange(List<T> data, int start, int end, List<List<T>> res) {
        if (start == end) {
            res.add(data);
        } else {
            T temp;
            for (int i = start; i < end; i++) {
                data = new ArrayList<>(data);
                temp = data.get(start);
                data.set(start, data.get(i));
                data.set(i, temp);
                getArrange(data, start + 1, end, res);
            }
        }
    }
//     public static List<List<Comparable>> getFullyArrange(List<Comparable> data) {
//            List<List<Comparable>> res = new ArrayList<>();
//            getArrange(data, 0, data.size(), res);
//            return res;
//        }
//
//        private static void getArrange(List<Comparable> data, int start, int end, List<List<Comparable>> res) {
//            if (start == end) {
//                res.add(data);
//            } else {
//                Comparable temp;
//                for (int i = start; i < end; i++) {
//                    data = new ArrayList<>(data);
//                    temp = data.get(start);
//                    data.set(start, data.get(i));
//                    data.set(i, temp);
//                    getArrange(data, start + 1, end, res);
//                }
//            }
//        }

}
