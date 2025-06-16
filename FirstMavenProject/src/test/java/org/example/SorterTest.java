package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorterTest {

    @Test
    void quickSort() {
        Sorter s = new Sorter();
        int n = 10;
        int [] a=new int [n];
        int i;
        for (i=0; i<n; i++){
            a[i]=n-i;
        }
        int[] actual = s.QuickSort(a);
        int [] expected = {1,2,3,4,5,6,7,8,9,10};
        for (i=0; i<n; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void testQuickSort() {
        Sorter s = new Sorter();
        int n = 10;
        long [] a=new long [n];
        int i;
        for (i=0; i<n; i++){
            a[i]=n-i;
        }
        long[] actual = s.QuickSort(a);
        long [] expected = {1,2,3,4,5,6,7,8,9,10};
        for (i=0; i<n; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void bubbleSort() {
        Sorter s = new Sorter();
        int n = 10;
        int [] a=new int [n];
        int i;
        for (i=0; i<n; i++){
            a[i]=n-i;
        }
        int[] actual = s.BubbleSort(a);
        int [] expected = {1,2,3,4,5,6,7,8,9,10};
        for (i=0; i<n; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void testBubbleSort() {
        Sorter s = new Sorter();
        int n = 10;
        long [] a= new long [n];
        int i;
        for (i=0; i<n; i++){
            a[i]=n-i;
        }
        long[] actual = s.BubbleSort(a);
        long [] expected = {1,2,3,4,5,6,7,8,9,10};
        for (i=0; i<n; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}
