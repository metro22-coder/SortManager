//package com.sparta.im;
//
//import com.sparta.im.sorters.BinarySorter;
//import com.sparta.im.sorters.BubbleSorter;
//import com.sparta.im.sorters.MergeSorter;
//import com.sparta.im.sorters.Sortable;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.Arrays;
//import java.util.Random;
//
//import static com.sparta.im.display.DisplayManager.printResults;
//
//public class PerformanceTester {
//
//    private int[] unsortedArray;
//    private static int [] arrayToSort;
//
//    @BeforeAll
//    public static void classSetup(){
//        Random random= new Random();
//        arrayToSort =new int[100];
//        for (int i=0 ; i<100 ; i++){
//            arrayToSort[i] = random.nextInt(1000)+1;
//        }
//    }
//    @BeforeEach
//    public void setup() {unsortedArray = arrayToSort.clone();}
//
//    @Test
//    public void testBubbleSort(){
//        System.out.println("********"+ Arrays.toString(unsortedArray));
//        Sortable sorter = new BubbleSorter();
//        long start= System.nanoTime();
//        int[] sortedArray = sorter.sortArray(unsortedArray);
//        long end = System.nanoTime();
//        printResults(sorter.toString(),end-start,sortedArray);
//    }
//    @Test
//    public void testMergeSorter() {
//        System.out.println("********" + Arrays.toString(unsortedArray));
//        Sortable sorter = new MergeSorter();
//        long start = System.nanoTime();
//        int[] sortedArray = sorter.sortArray(unsortedArray);
//        long end = System.nanoTime();
//        printResults(sorter.toString(), end - start, sortedArray);
//    }
//
//    @Test
//    public void testBinarySorter() {
//        System.out.println("********" + Arrays.toString(unsortedArray));
//        Sortable sorter = new BinarySorter();
//        long start = System.nanoTime();
//        int[] sortedArray = sorter.sortArray(unsortedArray);
//        long end = System.nanoTime();
//        printResults(sorter.toString(), end - start, sortedArray);
//    }
//
//    private void printResults(String toString, long l, int[] sortedArray) {
//    }
//}
