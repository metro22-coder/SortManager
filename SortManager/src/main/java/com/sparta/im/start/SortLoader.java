package com.sparta.im.start;

import com.sparta.im.display.DisplayManager;
import com.sparta.im.sorters.Sortable;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortLoader {
    public static void start() {
        Scanner scanner= new Scanner(System.in);
        DisplayManager.displaySortChoices();
        int choice = scanner.nextInt();
        int elements= scanner.nextInt();
        Sortable sort = SortFactory.getSorter(choice);
        Random rd = new Random(); // creating Random object
        int[] arr = new int[elements];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(1000); // storing random integers in an array

        }

        DisplayManager.printBeforeSort(sort,arr);
        int [] sorted = sort.sortArray(arr);
        DisplayManager.printResults(sort, sorted );

    }
}
