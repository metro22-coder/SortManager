//package com.sparta.im;
//
//import com.sparta.im.sorters.Sortable;
//import com.sparta.im.start.SortFactory;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.Random;
//
//public class SortTester {
//
//    private static Sortable sorter;
//
//    private int [] unsortedArray;
//
//    @BeforeAll
//    public static void setClass() {
//        Sortable Sortable = SortFactory.getSorter(2);
//        System.out.println("Testing using the " + sorter);
//    }
//
//    @BeforeEach
//    public void setup(){
//        Random random= new Random();
//        unsortedArray= new int[20];
//        for (int i= 0; i<10; i++){
//            unsortedArray[i] = random.nextInt(100)+1;
//        }
//    }
//    @Test
//    public void testArrayWithDuplicates(){
//        int[] unsortedArray ={7,3,2,4,65,74,2,12,2,4};
//        int[] sortedArray = sorter.sortArray(unsortedArray);
//        Assertions.assertArrayEquals((sortedArray.length; unsortedArray.length));
//        for (int i =0; i< sortedArray.length-1;i++){
//            Assertions.assertTrue(sortedArray[i+1]>=sortedArray[i]);
//        }
//    }
//    @Test
//    public void testLargeArray(){
//        int[] sortedArray = sorter.sortArray(unsortedArray);
//        Assertions.assertEquals(sortedArray.length, unsortedArray.length);
//        for (int i = 0; i< sortedArray.length-1;i++){
//            Assertions.assertTrue(sortedArray[i+1]>=sortedArray[i]);
//        }
//    }
//}
