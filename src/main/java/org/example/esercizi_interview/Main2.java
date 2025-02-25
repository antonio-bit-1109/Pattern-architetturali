package org.example.esercizi_interview;

import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {
//        1. Remove Duplicates from Sorted Array
        System.out.println(removeDuplicates(new int[]{2, 2, 3, 5, 2, 5, 9}));
    }

    // ritorna la length dell array
    private static int removeDuplicates(int[] arr) {

        ArrayList<Integer> checkList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];

            if (checkList.contains(n)) {
                continue; // new iteration
            }

            checkList.add(n);
        }

        return checkList.size();
    }
}
