# Sort Manager Project

## Purpose

This project allows the user to user to choose the sort method that he/she wants to implement. The application is then asking for the size of the array where the user has to input a number between 0-1000.
The sorter will then start sorting the array and will output the unsorted array of numbers as well as the sorted array and the time taken in nanoseconds to perform the task.

## Sort Methods

1.[Bubble Sort](https://en.wikipedia.org/wiki/Bubble_sort)\
2.[Binary Tree Sort](https://en.wikipedia.org/wiki/Tree_sort)\
3.[Merge Sort](https://en.wikipedia.org/wiki/Merge_sort)

## Observations

The Binary tree is not yet ready for use and it is under review.\
Also after a lot of testing the 2 ready applications that is Bubble sort and Merge sort have been compared in terms of their
performance using small and large size arrays.

| Sort Method | BubbleSort | MergeSort |
|-------------|------------|-----------|
| 10 numbers  | 61300ns    | 70000ns   | 
| 100 numbers | 282600ns   | 240500ns  |
| 500 numbers | 1107100ns  | 531600ns  |


## Conclusion
In conclusion the Bubble sort method is faster when it comes to smaller size arrays but after the array size gets large
the efficiency of Bubble sort slows down compared to the Merge sort method that seems mre efficient in larger size arrays.

