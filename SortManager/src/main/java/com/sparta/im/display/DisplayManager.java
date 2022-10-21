package com.sparta.im.display;

import com.sparta.im.sorters.Sortable;

import java.util.ArrayList;
import java.util.Arrays;

public class DisplayManager {

    public static ArrayList<String> getMenuItems(){
        return new ArrayList<>(Arrays.asList(
                "BubbleSorter" ,
                "BinarySorter",
                "MergeSorter"
        ));
    }

    public static void printBeforeSort(Sortable sort, int[] arrayToSort){
        System.out.println("Sorting Using the: " + sort);
        System.out.println("Before Sorting:\n" + Arrays.toString(arrayToSort));
    }
    public static void printResults(Sortable sorter,int[] arrayToSort){
        long start =System.nanoTime();
        int[] sortedArray = sorter.sortArray(arrayToSort);
        System.out.println("After Sorting:\n"+ Arrays.toString(sortedArray));
        long end= System.nanoTime();
        System.out.println("Time take: " +(end-start)+" nanoseconds");
    }
    public static void displaySortChoices(){
        System.out.println("Enter the number of the sorter you want to use: ");
        for (int i=0; i<getMenuItems().size();i++){
            System.out.println(i + 1 +". "+ getMenuItems().get(i));
        }
    }
}
