package mergesortedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedListTest {

    @Test
    void sortedMergedListTest1() {

        int[][] test = {{1,4,5},{1,3,4},{2,6}};
        assertArrayEquals(new int []{1,1,2,3,4,4,5,6},MergeSortedList.sortedMergedList(test));

    }

    @Test
    void sortedMergedListTest2() {

        int[][] test = {{},{1,3,4},{2,6}};
        assertArrayEquals(new int []{1,2,3,4,6},MergeSortedList.sortedMergedList(test));

    }
}