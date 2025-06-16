package org.example;

import java.util.ArrayList;
import java.util.List;
public class Task6 {
    public static void main(String[] args){
        int n = 100;
        int i;
        int imaxi, maxi,sum;
        maxi = -1;
        imaxi = -1;
        sum = 0;
        List<Integer> a = new ArrayList<>(n);
        for (i=0; i<n; i++){
            a.add((int) (Math.random()*1001));
        }
        for (int s: a){
            if (s>maxi) {
                maxi = s;
                imaxi = a.indexOf(s);
            }
            sum = sum + s;
        }
        System.out.println("Максимальное значение = " + maxi +" находится в элементе под номером " + imaxi);
        System.out.println("Среднее значение = " + sum/100);
    }
}
