package com.sparta.im.start;

import com.sparta.im.sorters.BinarySorter;
import com.sparta.im.sorters.BubbleSorter;
import com.sparta.im.sorters.MergeSorter;
import com.sparta.im.sorters.Sortable;

public class SortFactory {

    public static Sortable getSorter (int choice) {
        switch(choice){
            case 1:
                return new BubbleSorter();

            case 2:
                return new BinarySorter();

            case 3:
                return new MergeSorter();

            default:
                System.out.println("Please enter the correct number");
        }
        return null;
    }
}
