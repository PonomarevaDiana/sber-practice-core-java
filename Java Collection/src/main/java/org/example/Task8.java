package org.example;

import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static void main(String[] args){
        int n = 30;
        int tmp,i;
        List<Integer> a = new ArrayList<>();
        for (i=0; i<n; i++){
            a.add ((int) (Math.random()*1001));
        }
        System.out.println("Массив до сортировки:");
        for (int s: a){
            System.out.print(s+ " ");
        }
        for(i=1; i<a.size(); i++){
            for (int j=a.size()-1; j>=i; j--){
                if (a.get(j)<a.get(j-1)){
                    tmp = a.get(j);
                    a.set(j, a.get(j-1));
                    a.set(j-1, tmp);
                }
            }
        }
        System.out.println();
        System.out.println("Массив после сортировки:");
        for (int s: a){
            System.out.print((s)+" ");
        }
    }
}
