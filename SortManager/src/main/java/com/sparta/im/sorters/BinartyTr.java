package com.sparta.im.sorters;

public interface BinartyTr {
    int getRootElement();

    int getNumberOfElements();

    void addElement(int element);

    void addElements(final int[] elements);

    boolean findElement(int value);

    int getLeftChild(int element);

    int getRightChild(int element);

    int[] getSortedTreeAsc();

    int[] getSortedTreeDesc();
}
