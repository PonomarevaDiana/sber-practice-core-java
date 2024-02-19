package ru.sber.base.syntax.Task8;
import java.lang.Math;
public class Main {
    public static class Task8
    {
        public static void main(String[] args){
            int n = 30;
            int tmp,i;
            int [] a = new int [n];
            for (i=0; i<n; i++){
                a[i] = (int) (Math.random()*1001);
            }
            System.out.println("Массив до сортировки:");
            for (i=0; i<n; i++){
                System.out.print(a[i]+ " ");
            }
            for(i=1; i<n; i++){
                for (int j=n-1; j>=i; j--){
                    if (a[j]<a[j-1]){
                        tmp = a[j];
                        a[j] = a [j-1];
                        a[j-1] = tmp;
                    }
                }
            }
            System.out.println();
            System.out.println("Массив после сортировки:");
            for (i=0; i<n; i++){
                System.out.print(a[i] + " ");
            }
        }
    }
}
