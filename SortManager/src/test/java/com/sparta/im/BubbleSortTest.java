package com.sparta.im;

import com.sparta.im.sorters.BubbleSorter;
import org.junit.jupiter.api.*;

class BubbleSortTest {
    private BubbleSorter bubbleSort;

    @BeforeEach
    void setUp() {
        System.out.println("Setting up the bubble sort");
        bubbleSort = new BubbleSorter();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tidying up");
        bubbleSort = null;
    }


    @Test
    @DisplayName("Bubble sort Tester")
    void sortArray1() {
        BubbleSorter bubbleSort = new BubbleSorter();
        int[] numbers = {2,4,3,64,65};
        int[] sortedNumbers = {2,3,4,64,65};
        Assertions.assertArrayEquals(sortedNumbers, bubbleSort.sortArray(numbers));
    }
}