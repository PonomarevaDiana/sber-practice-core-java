package ru.sber.base.syntax.Task6;
import java.lang.Math;
public class Main {
    public static class Task6
    {
        public static void main(String[] args){
            int n = 100;
            int i;
            int imaxi, maxi,sum;
            maxi = -1;
            imaxi = -1;
            sum = 0;
            int [] a = new int [n];
            for (i=0; i<n; i++){
                a[i] = (int) (Math.random()*1001);
                if (a[i]>maxi) {
                    maxi = a[i];
                    imaxi = i;
                }
                sum = sum + a[i];
            }
            System.out.println("Максимальное значение = " + maxi +" находится в элементе под номером " + imaxi);
            System.out.println("Среднее значение = " + sum/100);
        }
    }
}
