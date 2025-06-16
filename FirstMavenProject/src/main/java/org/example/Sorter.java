package org.example;
public class Sorter {
    public static void Sort(int[] a, int l, int r) {
        int i, j;
        int x, y;
        while (l < r) {
            x = a[(l + r) / 2];
            i = l;
            j = r;
            while (i <= j) {
                while (a[i] < x) {
                    i = i + 1;
                }
                while (a[j] > x) {
                    j = j - 1;
                }
                if (i <= j) {
                    y = a[i];
                    a[i] = a[j];
                    a[j] = y;
                    i = i + 1;
                    j = j - 1;
                }

            }
            if (j - l < r - i) {
                Sort(a, l, j);
                l = i;
            } else {
                Sort(a, i, r);
                r = j;
            }
        }
    }

    public int[] QuickSort(int[] a) {
        Sort(a, 0, a.length - 1);
        return a;
    }



    public static void Sort(long[] a, int l, int r) {
        int i, j;
        long x;
        long y;
        while (l < r) {
            x = a[(l + r) / 2];
            i = l;
            j = r;
            while (i <= j) {
                while (a[i] < x) {
                    i = i + 1;
                }
                while (a[j] > x) {
                    j = j - 1;
                }
                if (i <= j) {
                    y = a[i];
                    a[i] = a[j];
                    a[j] = y;
                    i = i + 1;
                    j = j - 1;
                }

            }
            if (j - l < r - i) {
                Sort(a, l, j);
                l = i;
            } else {
                Sort(a, i, r);
                r = j;
            }
        }
    }

    public long[] QuickSort(long[] a) {
        Sort(a, 0, a.length - 1);
        return a;
    }

    public int[] BubbleSort(int[] a) {
        int i, j, tmp;
        int n = a.length;
        for (i = 1; i < n; i++) {
            for (j = n - 1; j >= i; j--) {
                if (a[j] < a[j - 1]) {
                    tmp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tmp;
                }
            }
        }
        return a;
    }

    public long[] BubbleSort(long[] a) {
        int i, j;
        long tmp;
        int n = a.length;
        for (i = 1; i < n; i++) {
            for (j = n - 1; j >= i; j--) {
                if (a[j] < a[j - 1]) {
                    tmp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tmp;
                }
            }
        }
        return a;
    }
}
